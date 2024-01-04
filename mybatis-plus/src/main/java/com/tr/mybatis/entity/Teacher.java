package com.tr.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.Data;

/**
 * @Author: TR
 */
@Data
@Table(name = "teacher")
public class Teacher {

    @TableId(type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column
    private Integer id;
    @Column(comment = "姓名")
    private String name;
    @Column(comment = "任教学科")
    private String subject;

}
