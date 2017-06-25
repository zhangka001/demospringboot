package com.zrb.mapper.ext;

import com.zrb.domain.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zrb on 2017/5/20.
 */

public interface CourseMapper {


    public void Insert(@Param("id") Integer id, @Param("name") String name);

    @Insert("INSERT INTO course(id, name) VALUES(#{id},#{name})")
    public void Inset(@Param("id") Integer id, @Param("name") String name);


    @Select("select * from course")
    List<Course> getCourses();


}
