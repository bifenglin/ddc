package com.cuiyun.ddc.common.exception.auth;


import com.cuiyun.ddc.common.exception.DdcException;
import com.cuiyun.ddc.common.exception.ServiceExceptionEnum;

/**
 * @program: kfcoding-cloud
 * @description: 拒绝访问异常
 * @author: maple
 * @create: 2018-08-02 16:27
 **/
public class ClientForbiddenException extends DdcException {

    public ClientForbiddenException(ServiceExceptionEnum serviceExceptionEnum) {
        super(serviceExceptionEnum);
    }
}
