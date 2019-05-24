package com.cuiyun.ddc.common.exception;

import com.cuiyun.ddc.common.msg.ObjectRestResponse;

/**
 * @program: kfcoding
 * @description: 封装ddc的异常
 * @author: maple
 * @create: 2018-05-05 20:57
 **/
public class DdcException extends RuntimeException {

    private int status;
    private String message;

    public DdcException(ServiceExceptionEnum serviceExceptionEnum){
        this.status = serviceExceptionEnum.getStatus();
        this.message = serviceExceptionEnum.getMessage();
    }

    public DdcException(int status, String message){
        this.status = status;
        this.message = message;
    }

    public DdcException(ObjectRestResponse objectRestResponse){
        this.status = objectRestResponse.getStatus();
        this.message = objectRestResponse.getMessage();
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
