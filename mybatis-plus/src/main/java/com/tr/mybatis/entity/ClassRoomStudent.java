package com.tr.mybatis.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.Data;

/**
 * @Author: TR
 */
@Data
@Table(name = "class_room_student")
public class ClassRoomStudent {

    @Column(isNull = false)
    private Integer classRoomId;
    @Column(isNull = false)
    private Integer studentId;

}
