package com.gaoheyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gaoheyang.domain.ResponseResult;
import com.gaoheyang.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-08-24 11:09:24
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}

