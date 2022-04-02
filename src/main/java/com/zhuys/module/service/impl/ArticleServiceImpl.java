package com.zhuys.module.service.impl;

import cn.hutool.json.JSONObject;
import com.zhuys.common.result.ResponseResult;
import com.zhuys.common.result.ResponseUtils;
import com.zhuys.module.service.ArticleService;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhuys
 * @company tydic
 * @create 2022-04-01
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Override
    public ResponseResult getSearchArticle(int from, int size, String searchStr) {
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.from(from);
        sourceBuilder.size(size);
        SearchRequest searchRequest = new SearchRequest("test-article");
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        //查询条件1 head_name like
        MatchQueryBuilder queryBuilder1 = QueryBuilders.matchQuery("head_name",searchStr);
        //查询条件2 content 分词查询
        QueryStringQueryBuilder queryStringQueryBuilder = new  QueryStringQueryBuilder(searchStr)
                .field("head_name").field("content").analyzer("ik_max_word").defaultOperator(Operator.OR);
        boolQueryBuilder.should(queryBuilder1);
        boolQueryBuilder.should(queryStringQueryBuilder);
        sourceBuilder.query(boolQueryBuilder);
        //高亮
        //构建高亮体
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        highlightBuilder.preTags("<span style=\"color:red\">");
        highlightBuilder.postTags("</span>");
        //高亮字段
        highlightBuilder.field("content").field("head_name");
        sourceBuilder.highlighter(highlightBuilder);
        searchRequest.source(sourceBuilder);
        try {
            SearchResponse response = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
            //获取搜索的文档结果
            SearchHits hit = response.getHits();
            SearchHit[] hits = hit.getHits();
            List<JSONObject> list = new ArrayList<>();
            for (SearchHit searchHit : hits) {
                //将文档中的每一个对象转换json串值
                String sourceAsString = searchHit.getSourceAsString();
                JSONObject sourceJSON = new JSONObject(sourceAsString);
                //获取对应的高亮域
                Map<String, HighlightField> highlightFields = searchHit.getHighlightFields();
                //高亮字段
                HighlightField highlightContent = highlightFields.get("content");
                if(highlightContent!=null){
                    // 为title串值增加自定义的高亮标签
                    org.elasticsearch.common.text.Text[] titleTexts = highlightContent.fragments();
                    String content = "";
                    for (org.elasticsearch.common.text.Text text : titleTexts) {
                        content += text;
                    }
                    //将追加了高亮标签的串值重新填充到对应的对象
                    sourceJSON.put("redContent",content);
                }
                //高亮字段
                HighlightField highlightHeadName = highlightFields.get("head_name");
                if(highlightHeadName!=null){
                    // 为title串值增加自定义的高亮标签
                    org.elasticsearch.common.text.Text[] titleTexts = highlightHeadName.fragments();
                    String content = "";
                    for (org.elasticsearch.common.text.Text text : titleTexts) {
                        content += text;
                    }
                    //将追加了高亮标签的串值重新填充到对应的对象
                    sourceJSON.put("head_name",content);
                }
                list.add(sourceJSON);
            }
            return ResponseUtils.makeOKRsp(list);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ResponseUtils.makeErrRsp("查询es出错");
    }
}
