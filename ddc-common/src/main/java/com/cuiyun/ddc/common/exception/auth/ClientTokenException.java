package com.cuiyun.ddc.common.exception.auth;


import com.cuiyun.ddc.common.exception.DdcException;
import com.cuiyun.ddc.common.exception.ServiceExceptionEnum;

/**
 * Created by bifenglin on 2018/8/10.
 */
public class ClientTokenException extends DdcException {
    public ClientTokenException(ServiceExceptionEnum serviceExceptionEnum) {
        super(serviceExceptionEnum);
    }
}
