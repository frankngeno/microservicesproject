package com.fngeno.departmentservice.service;

import com.fngeno.departmentservice.entity.Department;
import com.fngeno.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartmentById method of DepartmentService");
        return departmentRepository.save(department);
    }
    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService");
        return departmentRepository.findDepartmentById(departmentId);
    }
}
