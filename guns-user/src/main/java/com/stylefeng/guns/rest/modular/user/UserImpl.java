package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserApi;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserImpl implements UserApi {


    @Override
    public boolean login(String username, String password) {
        System.out.println("this is user service !" + username + "," + password);
        return false;

    }
}
