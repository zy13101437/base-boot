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
@Table(name = "sys_user_depart")
@Entity
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "系统用户机构中间表")
public class UserDepart implements Serializable {
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
	protected Date updateDate;	// 更新日期

	/**
	 * 删除标记
	 */
	@ApiModelProperty(value = "删除标记")
	protected String delFlag ; 	// 删除标记（0：正常；1：删除；2：审核）


	/**用户id*/
	private Long userId;
	/**部门id*/
	private Long depId;

	public UserDepart() {

	}

	public UserDepart(Long id, Long userId, Long depId) {
		super();
		this.id = id;
		this.userId = userId;
		this.depId = depId;
	}
	
}
