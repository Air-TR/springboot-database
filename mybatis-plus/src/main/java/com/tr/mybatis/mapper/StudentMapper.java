package com.tr.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tr.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
