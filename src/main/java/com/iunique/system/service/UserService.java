package com.iunique.system.service;

import com.iunique.system.dto.PageDTO;
import com.iunique.system.dto.WebResult;
import com.iunique.system.entity.User;

public interface UserService {


    WebResult saveUser(User user);

    WebResult selectUserList(PageDTO pageDto, User user);
}
