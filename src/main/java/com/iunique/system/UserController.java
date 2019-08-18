package com.iunique.system;

import com.iunique.system.dto.CollectionDTO;
import com.iunique.system.dto.WebResult;
import com.iunique.system.entity.User;
import com.iunique.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户controller")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;


    /**
     * 新增用户接口
     *
     * @param user
     * @return
     */
    @PostMapping("post")
    @ApiOperation(httpMethod = "post", response = WebResult.class, value = "新增用户", notes = "新增用户")
    public WebResult saveUser(@RequestBody @ApiParam(name = "用户实体类", required = true) User user) {
        userService.saveUser(user);
        return WebResult.ok();
    }

    /**
     * 查询用户列表
     * @param collectionDTO
     * @return
     */
    @PostMapping("list")
    @ApiOperation(httpMethod = "post", response = WebResult.class, value = "查询用户列表", notes = "查询用户列表")
    public WebResult selectList(@RequestBody @ApiParam(name = "分页DTO", required = true) CollectionDTO collectionDTO) {
        System.out.println(collectionDTO);
        WebResult webResult = userService.selectUserList(collectionDTO.getPageDTO(), collectionDTO.getUser());
        return webResult;
    }


}
