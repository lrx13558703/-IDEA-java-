package com.test.apitestpro.domain.mapper;

import com.test.apitestpro.domain.entity.StudentInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoEntityMapper {
    int deleteByPrimaryKey(String ID);

    int insert(StudentInfoEntity record);

    int insertSelective(StudentInfoEntity record);

    StudentInfoEntity selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(StudentInfoEntity record);

    int updateByPrimaryKey(StudentInfoEntity record);

    List<StudentInfoEntity> getStudentInfos();

}