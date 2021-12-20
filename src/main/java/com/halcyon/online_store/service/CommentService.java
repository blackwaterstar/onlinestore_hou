package com.halcyon.online_store.service;

import com.halcyon.online_store.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
public interface CommentService extends IService<Comment> {

    int addComment(Comment comment);

    int deleteComment(String commentId);

    Comment selectComment(String commentId);
}
