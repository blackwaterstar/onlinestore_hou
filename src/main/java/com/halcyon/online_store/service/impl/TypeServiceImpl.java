package com.halcyon.online_store.service.impl;

import com.halcyon.online_store.entity.Type;
import com.halcyon.online_store.mapper.TypeMapper;
import com.halcyon.online_store.service.TypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public int addType(Type type) {
        return typeMapper.insert(type);
    }

    @Override
    public int deleteType(Long tid) {
        return typeMapper.deleteById(tid);
    }

    @Override
    public int updateType(Type type) {
        return typeMapper.updateById(type);
    }

    @Override
    public Type selectType(Long tid) {
        return typeMapper.selectById(tid);
    }

    @Override
    public List<Type> listType() {
        return typeMapper.selectList(null);
    }
}
