package com.halcyon.online_store.service.impl;

import com.halcyon.online_store.entity.Log;
import com.halcyon.online_store.mapper.LogMapper;
import com.halcyon.online_store.service.LogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
