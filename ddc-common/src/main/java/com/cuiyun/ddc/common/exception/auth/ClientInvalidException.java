package com.cuiyun.ddc.common.exception.auth;

import com.cuiyun.ddc.common.exception.DdcException;
import com.cuiyun.ddc.common.exception.ServiceExceptionEnum;

/**
 * @program: kfcoding-cloud
 * @description: 验证异常
 * @author: maple
 * @create: 2018-08-02 17:13
 **/
public class ClientInvalidException extends DdcException {
    public ClientInvalidException(ServiceExceptionEnum serviceExceptionEnum) {
        super(serviceExceptionEnum);
    }
}
