package com.cuiyun.ddc.common.exception.auth;


import com.cuiyun.ddc.common.exception.DdcException;
import com.cuiyun.ddc.common.exception.ServiceExceptionEnum;

/**
 * Created by bifenglin on 2018/8/8.
 */
public class UserTokenException extends DdcException {
    public UserTokenException(ServiceExceptionEnum serviceExceptionEnum) {
        super(serviceExceptionEnum);
    }
}
