package com.fngeno.user.valueobjects;

import com.fngeno.user.entity.User;

public class ResponseTemplateMapper {

    private User user;
    private Department department;

    public ResponseTemplateMapper() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ResponseTemplateMapper{" +
                "user=" + user +
                ", department=" + department +
                '}';
    }
}
