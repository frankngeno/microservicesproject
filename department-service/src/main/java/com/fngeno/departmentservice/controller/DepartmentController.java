package com.fngeno.departmentservice.controller;

import com.fngeno.departmentservice.entity.Department;
import com.fngeno.departmentservice.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
//    private final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Department saveDepartment(@RequestBody Department department) {
//        log.info("Inside saveDepartment method of DepartmentController");
        return this.departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
//        log.info("Inside findDepartmentById method of DepartmentController");
        return this.departmentService.findDepartmentById(departmentId);
    }
}
