package com.zrb.controller;

import com.zrb.domain.Course;
import com.zrb.mapper.ext.CourseMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zrb on 2017/6/25.
 */
@Controller
@RequestMapping("/poi")
public class TestController {

    @Resource
    private CourseMapper courseMapper;

    @RequestMapping(value = "/get")
    public void getCourse(){
        List<Course> courses = courseMapper.getCourses();
        System.out.println(courses.toString());
    }
}
