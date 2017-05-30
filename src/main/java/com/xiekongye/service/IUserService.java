package com.xiekongye.service;

import com.xiekongye.models.User;
import org.springframework.stereotype.Service;

/**
 * Created by You on 2017/5/30.
 */
@Service
public interface IUserService {
    /**
     * 根据用户名获取用户信息
     * */
    User getUserInfo(String userName);

    /**
     * 保存用户信息
     * */
    boolean saveUserInfo(User user);
}
