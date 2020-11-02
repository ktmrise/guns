package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.ServiceApi;
import org.springframework.stereotype.Component;

@Component
@Service
public class ServiceApiImpl implements ServiceApi {



    @Override
    public boolean isLogin(String username, String password) {
        return true;
    }
}
