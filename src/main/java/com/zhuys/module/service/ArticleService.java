package com.zhuys.module.service;

import com.zhuys.common.result.ResponseResult;

/**
 * @author zhuys
 * @company tydic
 * @create 2022-04-01
 */
public interface ArticleService {

    public ResponseResult getSearchArticle(int from,int size,String searchStr);

}
