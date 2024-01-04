package com.tr.database.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tr.database.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
