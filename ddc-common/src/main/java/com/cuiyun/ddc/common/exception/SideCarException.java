package com.cuiyun.ddc.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: kfcoding-cloud
 * @description:
 * @author: maple
 * @create: 2018-09-03 14:30
 **/
@AllArgsConstructor
@Data
public class SideCarException extends RuntimeException{

    private int status = 100001;
    private String message;

    public SideCarException(String message) {
        this.message = message;
    }
}
