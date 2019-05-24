package com.cuiyun.ddc.common.msg.auth;

import com.cuiyun.ddc.common.constant.RestCodeConstants;
import com.cuiyun.ddc.common.msg.BaseResponse;

/**
 * @program: kfcoding-cloud
 * @description: token不允许返回类
 * @author: maple
 * @create: 2018-08-02 17:13
 **/
public class TokenForbiddenResponse  extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
