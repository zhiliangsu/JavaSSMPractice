package com.hitech.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultStatic {
    private Integer code; // 描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private String msg; // 描述统一格式中的消息，可选属性
    private Object data; // 描述统一格式中的数据


    // 增删改成功响应
    public static ResultStatic success(Integer code) {
        return new ResultStatic(code, "success", null);
    }

    // 查询成功响应
    public static ResultStatic success(Integer code, Object data) {
        return new ResultStatic(code, "success", data);
    }

    // 失败响应
    public static ResultStatic fail(Integer code, String msg) {
        return new ResultStatic(code, msg, null);
    }
}
