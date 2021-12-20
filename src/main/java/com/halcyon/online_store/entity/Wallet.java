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
    public class Wallet implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "w_id", type = IdType.AUTO)
      private Long wId;

    private Long userId;

    private Long userAmount;

      /**
     * 冻结金额，微信后台接收到再释放
     */
      private Long userFzamount;

      /**
     * 从创建到现在的总消费
     */
      private Long userConsume;


}
