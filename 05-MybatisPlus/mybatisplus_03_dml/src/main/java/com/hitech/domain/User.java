package com.hitech.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// @TableName("tbl_user")
public class User {
    // @TableId(type = IdType.INPUT)
    // @TableId(type = IdType.ASSIGN_ID)
    // @TableId(type = IdType.ASSIGN_UUID)
    // private String id;
    private Long id;
    private String name;
    @TableField(value = "pwd", select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;
    // @TableLogic(value = "0", delval = "1")
    private Integer deleted;
    @Version
    private Integer version;
}

