package com.halcyon.online_store.service;

import com.halcyon.online_store.entity.Address;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
public interface AddressService extends IService<Address> {
    int addAddress(Address address);

    List<Address> listAddress(Long userId);
}
