package com.tr.mybatis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tr.mybatis.entity.Teacher;
import com.tr.mybatis.mapper.TeacherMapper;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: TR
 */
@Api(tags = "教师")
@RestController
public class TeacherController {

    @Resource
    private TeacherMapper teacherMapper;

    @PostMapping("/teacher/insert")
    public Integer insert(@RequestBody Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @GetMapping("/teacher/{id}")
    public Teacher selectById(@PathVariable Integer id) {
        return teacherMapper.selectById(id);
    }

    @GetMapping("/teacher/page")
    public Page<Teacher> selectPage(Page page) {
        return teacherMapper.selectPage(page, null);
    }

}
