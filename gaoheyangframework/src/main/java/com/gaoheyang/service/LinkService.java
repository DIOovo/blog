package com.gaoheyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gaoheyang.domain.ResponseResult;
import com.gaoheyang.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-08-24 17:12:56
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}

