package com.gaoheyang.service;

import com.gaoheyang.domain.ResponseResult;
import com.gaoheyang.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);
}
