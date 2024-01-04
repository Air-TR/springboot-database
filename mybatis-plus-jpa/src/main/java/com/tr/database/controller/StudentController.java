package com.tr.database.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tr.database.entity.Student;
import com.tr.database.mapper.StudentMapper;
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

    /**
     * 这里的主键生成不遵循 Student 中定义的 @GeneratedValue(strategy = GenerationType.IDENTITY)，而是无规则的 int 数
     *  所以不建议在 jpa 定义的实体下，使用 mybatis 的 insert 操作
     */
    @PostMapping("/student/insert")
    public Integer insert(@RequestBody Student student) {
        return studentMapper.insert(student);
    }

    @GetMapping("/student/{id}")
    public Student selectById(@PathVariable Integer id) {
        return studentMapper.selectById(id);
    }

    @GetMapping("/student/page")
    public com.baomidou.mybatisplus.extension.plugins.pagination.Page<Student> selectPage(Page page) {
        return studentMapper.selectPage(page, null);
    }

}
