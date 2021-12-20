package com.halcyon.online_store.controller;


import com.halcyon.online_store.entity.Collect;
import com.halcyon.online_store.entity.vo.CartVO;
import com.halcyon.online_store.service.CollectService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
@RequestMapping("//collect")
public class CollectController {

    @Resource
    private CollectService collectService;

    @RequestMapping("addCollect")
    public int addCart(Long userId,Long ppid){
//       这几获得当前用户的当前购物车信息（所有）
        return collectService.addCollect(userId,ppid);

    }
    @RequestMapping("deleteCollect")
    public int deleteCollect(Long userId,Long ppid){
//       这几获得当前用户的当前购物车信息（所有）
        return collectService.deleteCollect(userId,ppid);

    }

    @RequestMapping("listCollect")
    public List<Collect> listCollect(Long userId){
//       这几获得当前用户的当前购物车信息（所有）
        return collectService.listCollect(userId);

    }



}

