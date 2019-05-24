package com.cuiyun.ddc.rest.rest;

import com.cuiyun.ddc.common.base.controller.BaseController;
import com.cuiyun.ddc.common.msg.ObjectRestResponse;
import com.cuiyun.ddc.rest.biz.UserBiz;
import com.cuiyun.ddc.rest.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
@Api("测试模块")
public class UserController extends BaseController<UserBiz, User> {

    @ApiOperation("")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ObjectRestResponse add() {
        return new ObjectRestResponse<>().data(getCurrentUserName()+ "--"+getCurrentUserId());
    }
}
