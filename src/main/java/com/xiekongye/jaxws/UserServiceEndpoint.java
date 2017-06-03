package com.xiekongye.jaxws;

import com.xiekongye.models.User;
import com.xiekongye.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by You on 2017/6/3.
 */
@Component
@WebService(serviceName = "UserService")
public class UserServiceEndpoint {
    @Autowired
    private IUserService userService;

    @WebMethod
    public User getUserInfo(String userName){
        return userService.getUserInfo(userName);
    }

    @WebMethod
    public boolean saveUserInfo(User user){
        return userService.saveUserInfo(user);
    }
}
