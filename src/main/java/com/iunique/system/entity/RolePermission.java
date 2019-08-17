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

/**
 * <p>
 * 角色权限表
 * </p>
 *
 * @author scott
 * @since 2018-12-21
 */
@Data
@Entity
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "系统角色权限中间表")
@Table(name = "sys_role_permission")
public class RolePermission implements Serializable {

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
     * 角色id
     */
    private Long roleId;

    /**
     * 权限id
     */
    private Long permissionId;
    
    /**
     * 数据权限
     */
    private String dataRuleReadIds;

    private String dataRuleWriteIds;

    public RolePermission() {
   	}
       
   	public RolePermission(Long roleId, Long permissionId) {
   		this.roleId = roleId;
   		this.permissionId = permissionId;
   	}

}
