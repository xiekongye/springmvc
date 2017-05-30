package com.xiekongye.service;

import com.xiekongye.models.User;
import org.springframework.stereotype.Service;

import static org.mockito.Mockito.mock;

/**
 * Created by You on 2017/5/30.
 */
@Service("userService")
public class UserService implements IUserService {
    public User getUserInfo(String userName) {
        return mock(User.class);
    }

    public boolean saveUserInfo(User user) {
        return true;
    }
}
