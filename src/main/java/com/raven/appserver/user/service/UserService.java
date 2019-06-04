package com.raven.appserver.user.service;

import com.raven.appserver.common.RestResult;
import com.raven.appserver.user.bean.UserBean;
import com.raven.appserver.user.pojos.InputUserCreate;
import com.raven.appserver.utils.RestResultCode;
import java.util.List;

public interface UserService {
    RestResult login(String username, String password);

    RestResultCode logout();

    String createUser(InputUserCreate data);

    RestResultCode updateUser(String uid, InputUserCreate data);

    RestResultCode updateUserState(String uid, Integer state);

    RestResultCode deleteUser(String uid);

    UserBean getUser(String uid);

    List<UserBean> getUserList(Integer type, Integer state);

    UserBean getUserByUsername(String username);

    Boolean isUserLogin();
}
