package com.halcyon.online_store.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.halcyon.online_store.entity.Address;
import com.halcyon.online_store.mapper.AddressMapper;
import com.halcyon.online_store.service.AddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

    @Resource
    private AddressMapper addressMapper1;

    @Override
    public int addAddress(Address address) {
        return addressMapper1.insert(address);
    }

    @Override
    public List<Address> listAddress(Long userId) {
        return addressMapper1.selectList(new QueryWrapper<Address>().eq("user_id",userId));
    }
}
