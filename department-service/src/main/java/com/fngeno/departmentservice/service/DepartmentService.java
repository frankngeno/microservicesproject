package com.fngeno.departmentservice.service;

import com.fngeno.departmentservice.entity.Department;
import com.fngeno.departmentservice.repository.DepartmentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;
//    private final Logger log = LoggerFactory.getLogger(DepartmentService.class);

    public Department saveDepartment(Department department) {
//        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }
    public Department findDepartmentById(Long departmentId) {
//        log.info("Inside findDepartmentById method of DepartmentService");
        return departmentRepository.findDepartmentById(departmentId);
    }
}
