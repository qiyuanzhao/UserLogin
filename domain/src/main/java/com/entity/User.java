package com.entity;


import com.persistence.BaseSqlEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.persistence.EntityStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;

@Entity
public class User extends BaseSqlEntity {

    @Column(nullable = false)
    private String username;

    private String password;

    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Long phone;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
