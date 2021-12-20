package com.halcyon.online_store.service.impl;

import com.halcyon.online_store.entity.Comment;
import com.halcyon.online_store.mapper.CommentMapper;
import com.halcyon.online_store.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public int addComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public int deleteComment(String commentId) {
        return commentMapper.deleteById(commentId);
    }

    @Override
    public Comment selectComment(String commentId) {
        return commentMapper.selectById(commentId);
    }
}
