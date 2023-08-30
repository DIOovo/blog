package com.gaoheyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gaoheyang.domain.ResponseResult;
import com.gaoheyang.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2023-08-26 16:11:48
 */
public interface UserService extends IService<User> {
    ResponseResult userInfo();
    ResponseResult updateUserInfo(User user);
    ResponseResult register(User user);
}

