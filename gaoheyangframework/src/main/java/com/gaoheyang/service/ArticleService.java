package com.gaoheyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gaoheyang.domain.ResponseResult;
import com.gaoheyang.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
