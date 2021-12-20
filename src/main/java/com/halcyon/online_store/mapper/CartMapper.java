package com.halcyon.online_store.mapper;

import com.halcyon.online_store.entity.Cart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.halcyon.online_store.entity.vo.CartVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
public interface CartMapper extends BaseMapper<Cart> {

    List<CartVO> selectCartVOByUserId(Long userId);

}
