package com.halcyon.online_store.controller;


import com.halcyon.online_store.entity.Comment;
import com.halcyon.online_store.entity.Product;
import com.halcyon.online_store.service.CommentService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
@RestController
@RequestMapping("//comment")
public class CommentController {
    @Resource
    private CommentService commentService;

    @RequestMapping("addComment")
    public int addComment(Comment comment){
        return commentService.addComment(comment);
    }

    @RequestMapping("deleteComment")
    public int deleteComment(String commentId){
        return commentService.deleteComment(commentId);
    }


    @RequestMapping("selectComment")
    public Comment updateComment(String commentId){
        return commentService.selectComment(commentId);
    }


}

