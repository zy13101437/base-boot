package com.iunique.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iunique.system.dto.PageDTO;
import com.iunique.system.dto.WebResult;
import com.iunique.system.entity.User;
import com.iunique.system.mapper.UserMapper;
import com.iunique.system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public WebResult saveUser(User user) {
        int i = userMapper.insert(user);
        if (i > 0){ return WebResult.ok();}
        return WebResult.build(0, "保存失败");

    }

    @Override
    public WebResult selectList(PageDTO pageDto, User user) {
        Wrapper<User> userWrapper = new QueryWrapper<>(user);
        IPage<User> userIPage = userMapper.selectPage(new Page<>(pageDto.getPageCount(), pageDto.getPageSize()), userWrapper);
        return WebResult.ok(userIPage.getRecords(), userIPage.getTotal());
    }

}
