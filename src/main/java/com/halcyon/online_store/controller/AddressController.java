package com.halcyon.online_store.controller;


import com.halcyon.online_store.entity.Address;
import com.halcyon.online_store.service.AddressService;
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
@RequestMapping("//address")
public class AddressController {

    @Resource
    private AddressService addressService;

    @RequestMapping("listAddress")
    public List<Address> listAddress(Long userId){
        return addressService.listAddress(userId);
    }

}

