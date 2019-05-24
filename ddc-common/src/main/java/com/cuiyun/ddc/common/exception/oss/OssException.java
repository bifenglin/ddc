package com.cuiyun.ddc.common.exception.oss;

/**
 * @program: kfcoding-cloud
 * @description:
 * @author: maple
 * @create: 2018-09-10 20:11
 **/
public class OssException extends RuntimeException{
    private int status = 100002;
    private String message;

    public OssException(String message) {
        this.message = message;
    }
}
