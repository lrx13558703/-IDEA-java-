package com.test.apitestpro.controller;

import com.test.apitestpro.dtos.StudentOutDTO;
import com.test.apitestpro.service.IStudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "apitestpro/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @ApiOperation(value = "获取所有的学生信息")
    @RequestMapping(value = "getStudentInfos", method = RequestMethod.GET)
    public List<StudentOutDTO> getStudentInfos() {
        return this.iStudentService.getStudentInfos();
    }
}
