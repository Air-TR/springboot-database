package com.tr.mybatis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tr.mybatis.entity.ClassRoom;
import com.tr.mybatis.mapper.ClassRoomMapper;
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
@Api(tags = "教室")
@RestController
public class ClassRoomController {

    @Resource
    private ClassRoomMapper classRoomMapper;

    @PostMapping("/classRoom/insert")
    public Integer insert(@RequestBody ClassRoom classRoom) {
        return classRoomMapper.insert(classRoom);
    }

    @GetMapping("/classRoom/{id}")
    public ClassRoom selectById(@PathVariable Integer id) {
        return classRoomMapper.selectById(id);
    }

    @GetMapping("/classRoom/page")
    public Page<ClassRoom> selectPage(Page page) {
        return classRoomMapper.selectPage(page, null);
    }

}
