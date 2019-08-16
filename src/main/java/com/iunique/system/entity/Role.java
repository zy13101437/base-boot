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
@ApiModel(value = "系统角色表")
@Table(name = "sys_role")
public class Role implements Serializable {

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
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    /**
     * 角色编码
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;


}
