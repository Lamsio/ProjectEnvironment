package com.java.webmvc.mapper;

import com.java.webmvc.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper {

    @Select("select * from student where sid=#{id}")
    Student getGoodsById(int id);
}