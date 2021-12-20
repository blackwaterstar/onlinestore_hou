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
    public class Collect implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "c_id", type = IdType.AUTO)
      private Long cId;

      /**
     * 收藏id
     */
      private Long collectId;

      /**
     * 用户id
     */
      private Long userId;

      /**
     * 商品详细id
     */
      private Long ppid;

      /**
     * 商品价格
     */
      private Long price;


}
