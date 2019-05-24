package com.cuiyun.ddc.rest.biz;

import com.cuiyun.ddc.common.base.biz.BaseBiz;
import com.cuiyun.ddc.common.exception.DdcException;
import com.cuiyun.ddc.rest.dao.UserMapper;
import com.cuiyun.ddc.rest.exception.BizExceptionEnum;
import com.cuiyun.ddc.rest.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserBiz extends BaseBiz<UserMapper, User> {

    public User validate(String account, String password){
        User user = new User();
        user.setAccount(account);
        user.setPassworld(password);
        user = baseMapper.selectOne(user);
        if (user == null)
            throw new DdcException(BizExceptionEnum.USER_NULL);
        else
            return user;
    }
}
