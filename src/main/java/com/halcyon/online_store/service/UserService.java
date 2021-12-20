package com.halcyon.online_store.service;

import com.halcyon.online_store.entity.User;
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
public interface UserService extends IService<User> {

    boolean login(String userid, String password);

    boolean register(User user);

    boolean checkUser(String userId);

    boolean modifyInfo(User user);

    List<User> searchUser(String username);

    List<User> listUser();
}

