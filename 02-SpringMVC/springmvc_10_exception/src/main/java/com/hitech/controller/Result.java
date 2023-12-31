package com.hitech.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code; // 描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private String msg; // 描述统一格式中的消息，可选属性
    private Object data; // 描述统一格式中的数据

    //构造方法是方便对象的创建
    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

}
