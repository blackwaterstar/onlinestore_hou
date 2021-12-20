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
    public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "a_id", type = IdType.AUTO)
      private Long aId;

    private Long userId;

    private String userAddr;


}
