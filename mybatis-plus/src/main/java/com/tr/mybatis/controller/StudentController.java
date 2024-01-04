package com.tr.mybatis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tr.mybatis.entity.Student;
import com.tr.mybatis.mapper.StudentMapper;
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
@Api(tags = "学生")
@RestController
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    @PostMapping("/student/insert")
    public Integer insert(@RequestBody Student student) {
        return studentMapper.insert(student);
    }

    @GetMapping("/student/{id}")
    public Student selectById(@PathVariable Integer id) {
        return studentMapper.selectById(id);
    }

    @GetMapping("/student/page")
    public Page<Student> selectPage(Page page) {
        return studentMapper.selectPage(page, null);
    }

}
