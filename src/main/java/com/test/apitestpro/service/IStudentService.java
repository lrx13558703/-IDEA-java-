package com.test.apitestpro.service;

import com.test.apitestpro.dtos.StudentOutDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {
    List<StudentOutDTO> getStudentInfos();
}
