package com.test.apitestpro.service.impl;

import com.test.apitestpro.domain.entity.StudentInfoEntity;
import com.test.apitestpro.domain.mapper.StudentInfoEntityMapper;
import com.test.apitestpro.dtos.StudentOutDTO;
import com.test.apitestpro.service.IStudentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentInfoEntityMapper studentInfoEntityMapper;

    @Override
    public List<StudentOutDTO> getStudentInfos() {
        List<StudentInfoEntity> studentList = this.studentInfoEntityMapper.getStudentInfos();

        ModelMapper modelMapper = new ModelMapper();
        TypeToken<List<StudentOutDTO>> typeToken = new TypeToken<List<StudentOutDTO>>() {
        };
        List<StudentOutDTO> result = modelMapper.map(studentList, typeToken.getType());

        return result;

    }
}
