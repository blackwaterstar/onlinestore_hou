package com.halcyon.online_store.service.impl;

import com.halcyon.online_store.entity.Admin;
import com.halcyon.online_store.mapper.AdminMapper;
import com.halcyon.online_store.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
