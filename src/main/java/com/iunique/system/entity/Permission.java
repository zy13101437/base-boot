package com.iunique.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "系统权限表")
@Table(name = "sys_permission")
public class Permission implements Serializable {

    /**
     * id
     */
    @Id
    @ApiModelProperty(value = "id")
    protected Long id;;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    protected String remarks;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    protected Long createBy;	// 创建者

    /**
     * 创建日期
     */
    @ApiModelProperty(value = "创建日期")
    protected Date createDate= new Date();;	// 创建日期

    /**
     * 更新者
     */
    @ApiModelProperty(value = "更新者")
    protected Long updateBy;	// 更新者

    /**
     * 更新日期
     */
    @ApiModelProperty(value = "更新日期")
    protected Date updateDate = new Date();	// 更新日期

    /**
     * 删除标记
     */
    @ApiModelProperty(value = "删除标记")
    protected String delFlag = "0"; 	// 删除标记（0：正常；1：删除；2：审核）



    /**
     * 父id
     */
    @ApiModelProperty(value = "父id")
    private Long parentId;

    /**
     * 菜单名称
     */
    @ApiModelProperty(value = "菜单名称")
    private String name;

    /**
     * 菜单权限编码，例如：“sys:schedule:list,sys:schedule:info”,多个逗号隔开
     */
    @ApiModelProperty(value = "菜单权限编码")
    private String perms;

    /**
     * 菜单图标
     */
    @ApiModelProperty(value = "菜单图标")
    private String icon;

    /**
     * 组件
     */
    @ApiModelProperty(value = "组件")
    private String component;

    /**
     * 组件名字
     */
    @ApiModelProperty(value = "组件名字")
    private String componentName;

    /**
     * 路径
     */
    @ApiModelProperty(value = "路径")
    private String url;
    /**
     * 一级菜单跳转地址
     */
    @ApiModelProperty(value = "一级菜单跳转地址")
    private String redirect;

    /**
     * 菜单排序
     */
    @ApiModelProperty(value = "菜单排序")
    private Integer sortNo;

    /**
     * 类型（0：一级菜单；1：子菜单 ；2：按钮权限）
     */
    @ApiModelProperty(value = "类型")
    private Integer menuType;

    /**
     * 是否叶子节点: 1:是  0:不是
     */
    @ApiModelProperty(value = "是否叶子节点")
    private boolean leaf;

    /**
     * 是否路由菜单: 0:不是  1:是（默认值1）
     */
    @ApiModelProperty(value = "是否路由菜单")
    private boolean route;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;



}
