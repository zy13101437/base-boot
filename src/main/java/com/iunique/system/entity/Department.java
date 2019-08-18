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
@ApiModel(value = "系统机构实体类")
@Table(name = "sys_department")
public class Department implements Serializable {

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
    protected Date createDate;	// 创建日期

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


    /**父机构ID*/
    @ApiModelProperty(value = "父机构ID")
    private Long parentId;
    /**机构/部门名称*/
    @ApiModelProperty(value = "机构/部门名称")
    private String departName;
    /**英文名*/
    @ApiModelProperty(value = "英文名")
    private String departNameEn;
    /**缩写*/
    @ApiModelProperty(value = "缩写")
    private String departNameAbbr;
    /**排序*/
    @ApiModelProperty(value = "排序")
    private Integer departOrder;
    /**描述*/
    @ApiModelProperty(value = "描述")
    private String description;
    /**机构类型*/
    @ApiModelProperty(value = "机构类型")
    private String orgType;
    /**机构编码*/
    @ApiModelProperty(value = "机构编码")
    private String orgCode;
    /**手机号*/
    @ApiModelProperty(value = "手机号")
    private String mobile;
    /**传真*/
    @ApiModelProperty(value = "传真*/")
    private String fax;
    /**地址*/
    @ApiModelProperty(value = "地址")
    private String address;
    /**备注*/
    @ApiModelProperty(value = "备注")
    private String memo;
    /**状态（1启用，0不启用）*/
    @ApiModelProperty(value = "状态")
    private String status;



}
