package com.halcyon.online_store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Long userId;

    private String username;

    private String password;

    private String address;

    @TableField("detailAddress")
    private String detailAddress;

    private String telephone;

    private String email;

    private String createtime;

    private String updatime;


}
