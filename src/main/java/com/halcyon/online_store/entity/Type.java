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
    public class Type implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "tid", type = IdType.AUTO)
      private Long tid;

    private Long id;

    private String name;


}
