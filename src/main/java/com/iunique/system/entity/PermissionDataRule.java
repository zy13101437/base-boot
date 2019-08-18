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
 * 菜单权限规则表
 * </p>
 *
 * @author huangzhilin
 * @since 2019-03-29
 */
@Data
@Entity
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "系统权限数据规则表")
@Table(name = "sys_permission_data_rule")
public class PermissionDataRule implements Serializable {

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
	protected Date createDate;;	// 创建日期

	/**
	 * 更新者
	 */
	@ApiModelProperty(value = "更新者")
	protected Long updateBy;	// 更新者

	/**
	 * 更新日期
	 */
	@ApiModelProperty(value = "更新日期")
	protected Date updateDate ;	// 更新日期

	/**
	 * 删除标记
	 */
	@ApiModelProperty(value = "删除标记")
	protected String delFlag ; 	// 删除标记（0：正常；1：删除；2：审核）



	/**
	 * 对应的菜单id
	 */
	private Long permissionId;

	/**
	 * 规则名称
	 */
	private String ruleName;
	
	/**
	 * 字段
	 */
	private String ruleColumn;
	
	/**
	 * 条件
	 */
	private String ruleConditions;
	
	/**
	 * 规则值
	 */
	private String ruleValue;
	

}
