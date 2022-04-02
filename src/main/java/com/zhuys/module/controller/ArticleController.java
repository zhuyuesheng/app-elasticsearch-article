package com.zhuys.module.controller;

import com.zhuys.common.result.ResponseResult;
import com.zhuys.module.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhuys on 17/10/24.
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping(value="/getEsData")
    public ResponseResult getEsData(int from,int size,String searchStr){
        return articleService.getSearchArticle( from, size, searchStr);
    }


}
