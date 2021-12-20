package com.halcyon.online_store.service;

import com.halcyon.online_store.entity.Collect;
import com.baomidou.mybatisplus.extension.service.IService;
import com.halcyon.online_store.entity.vo.CartVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
public interface CollectService extends IService<Collect> {

    int addCollect(Long userId, Long ppid);

    int deleteCollect(Long userId, Long ppid);

    List<Collect> listCollect(Long userId);
}
