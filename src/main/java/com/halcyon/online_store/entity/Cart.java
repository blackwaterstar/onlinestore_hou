package com.halcyon.online_store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Halcyon
 * @since 2021-12-09
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "c_id", type = IdType.AUTO)
      private Long cId;

      /**
     * 购物车id
     */
      private Long cartId;

      /**
     * 用户id
     */
      private Long userId;

      /**
     * 商品id
     */
      private Long ppid;

      /**
     * 商品数量
     */
      private Long pcount;


}
