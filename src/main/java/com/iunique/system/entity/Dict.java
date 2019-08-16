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
@ApiModel(value = "系统字典实体类")
@Table(name = "sys_dict")
public class Dict implements Serializable {

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


    private static final long serialVersionUID = 1L;
    private String value;	// 数据值
    private String label;	// 标签名
    private String type;	// 类型
    private String description;// 描述
    private Integer sort;	// 排序
    private Long parentId;//父Id

}
