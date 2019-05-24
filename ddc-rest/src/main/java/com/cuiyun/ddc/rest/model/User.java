package com.cuiyun.ddc.rest.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.cuiyun.ddc.common.base.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author maple
 * @since 2019-05-23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("research_user")
public class User extends BaseModel<User> {
    private static final long serialVersionUID = 1L;

    private String id;
    private String account;
    private String passworld;
}
