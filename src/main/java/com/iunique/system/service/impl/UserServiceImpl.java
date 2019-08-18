package com.iunique.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iunique.system.dto.PageDTO;
import com.iunique.system.dto.WebResult;
import com.iunique.system.entity.User;
import com.iunique.system.mapper.UserMapper;
import com.iunique.system.service.UserService;
import com.iunique.system.util.QueryWrapperUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public WebResult saveUser(User user) {
        int i = userMapper.insert(user);
        if (i > 0){ return WebResult.ok();}
        return WebResult.build(0, "保存失败");

    }

    @Override
    public WebResult selectUserList(PageDTO pageDto, User user) {
        QueryWrapper<User> userWrapper = QueryWrapperUtils.create(user);
        IPage<User> userIPage = userMapper.selectPage(new Page<>(pageDto.getPageCount(), pageDto.getPageSize()), userWrapper);
        return WebResult.ok(userIPage.getRecords(), userIPage.getTotal());
    }

}
