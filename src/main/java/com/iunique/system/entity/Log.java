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
 * 系统日志表
 * </p>
 *
 * @author zhangweijian
 * @since 2018-12-26
 */
@Data
@Entity
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "系统日志表")
@Table(name = "sys_log")
public class Log implements Serializable {

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
	 * 耗时
	 */
	private Long costTime;

	/**
	 * IP
	 */
	private String ip;

	/**
	 * 请求参数
	 */
	private String requestParam;

	/**
	 * 请求类型
	 */
	private String requestType;

	/**
	 * 请求路径
	 */
	private String requestUrl;
	/**
	 * 请求方法
	 */
	private String method;

	/**
	 * 操作人用户名称
	 */
	private String username;
	/**
	 * 操作人用户账户
	 */
	private String userid;
	/**
	 * 操作详细日志
	 */
	private String logContent;

	/**
	 * 日志类型（1登录日志，2操作日志）
	 */
	private Integer logType;

	/**
	 * 操作类型（）
	 */
	private Integer operateType;

}
