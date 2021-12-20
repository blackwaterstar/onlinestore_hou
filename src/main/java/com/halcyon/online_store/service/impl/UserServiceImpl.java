package com.halcyon.online_store.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.halcyon.online_store.entity.Log;
import com.halcyon.online_store.entity.User;
import com.halcyon.online_store.entity.Wallet;
import com.halcyon.online_store.mapper.LogMapper;
import com.halcyon.online_store.mapper.UserMapper;
import com.halcyon.online_store.mapper.WalletMapper;
import com.halcyon.online_store.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private WalletMapper walletMapper;

    @Resource
    private LogMapper logMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean login(String userid, String password) {
        User user = userMapper.selectById(userid);
        if (password.equals(user.getPassword())) {
            Log log = new Log();
            log.setState(1);
            log.setController("用户"+userid+"登录进页面");
            logMapper.insert(log);
            return true;
        }else return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean register(User user) {
        if (userMapper.insert(user) == 1) {
            Wallet wallet = new Wallet();
            wallet.setUserId(user.getUserId());
            walletMapper.insert(wallet);
            Log log = new Log();
            log.setState(2);
            log.setController("用户"+user.getUserId()+"注册成功");
            logMapper.insert(log);
            return true;
        } else return false;
    }

    @Override
    public boolean checkUser(String userId) {
        if (userMapper.selectById(userId) == null) {
            return true;
        } else return false;
    }

    @Override
    public boolean modifyInfo(User user) {
        return userMapper.updateById(user) == 1;
    }

    @Override
    public List<User> searchUser(String username) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("username",username);
        return userMapper.selectList(wrapper);
    }

    @Override
    public List<User> listUser() {
        return userMapper.selectList(null);
    }
}
