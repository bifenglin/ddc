package com.cuiyun.ddc.rest.rest;


import com.cuiyun.ddc.auth.annotation.IgnoreUserToken;
import com.cuiyun.ddc.auth.util.JwtTokenUtil;
import com.cuiyun.ddc.auth.util.jwt.IJWTInfo;
import com.cuiyun.ddc.auth.util.jwt.JWTInfo;
import com.cuiyun.ddc.common.msg.ObjectRestResponse;
import com.cuiyun.ddc.rest.biz.UserBiz;
import com.cuiyun.ddc.rest.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
@Api("测试模块")
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserBiz userBiz;

    @ApiOperation("")
    @IgnoreUserToken
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse getToken(@RequestBody User user) throws Exception {
        user = userBiz.validate(user.getAccount(), user.getPassworld());
        IJWTInfo info = new JWTInfo(user.getAccount(), user.getId(), user.getAccount());
        String token = jwtTokenUtil.generateToken(info);
        return new ObjectRestResponse<>().data(token);
    }

}
