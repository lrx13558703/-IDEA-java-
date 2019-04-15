package com.test.apitestpro.service.impl;

import com.test.apitestpro.domain.entity.StudentInfoEntity;
import com.test.apitestpro.domain.mapper.StudentInfoEntityMapper;
import com.test.apitestpro.dtos.StudentOutDTO;
import com.test.apitestpro.service.IStudentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class StudentService implements IStudentService {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

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

    @Override
    public boolean setmessage(String indto) {
        return false;
    }

    @Override
    public boolean setredis() {
        // set(key,value,outtime,单位)
        stringRedisTemplate.opsForValue().set("key1", "测试存入redis", 60, TimeUnit.SECONDS);
        return true;
    }

    @Override
    public String getredis(String into) {
      return   stringRedisTemplate.opsForValue().get(into);
    }
}
