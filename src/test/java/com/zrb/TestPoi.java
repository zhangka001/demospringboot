package com.zrb;

import com.zrb.domain.Course;
import com.zrb.mapper.ext.CourseMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zrb on 2017/6/25.
 */

public class TestPoi {

    @Resource
    private CourseMapper courseMapper;


    @Test
    public void test01(){
//        Workbook wb = new XSSFWorkbook();
//        // 创建第一个sheet（页），并命名
//        Sheet sheet = wb.createSheet("a");
        List<Course> courses = courseMapper.getCourses();
        System.out.println(courses.toString());

    }

}
