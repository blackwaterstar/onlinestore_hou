package com.halcyon.online_store.entity.dto;

import lombok.Data;

@Data
public class ResultDTO<T> {

    private Boolean result;
    private String message;
    private T data;


}
