package com.iunique.system.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageDTO implements Serializable {

    private Integer pageCount = 0;
    private Integer pageSize = 15;

}
