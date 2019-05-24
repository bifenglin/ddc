package com.cuiyun.ddc.common.msg.auth;

import com.cuiyun.ddc.common.constant.RestCodeConstants;
import com.cuiyun.ddc.common.msg.BaseResponse;

/**
 * @program: kfcoding-cloud
 * @description: token异常返回信息
 * @author: maple
 * @create: 2018-08-02 17:13
 **/
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
