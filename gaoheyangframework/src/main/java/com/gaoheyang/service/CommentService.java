package com.gaoheyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gaoheyang.domain.ResponseResult;
import com.gaoheyang.domain.entity.Comment;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2023-08-26 14:39:08
 */
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);
    ResponseResult commentList(String commentType, Long articleId, Integer pageNum, Integer pageSize);
}


