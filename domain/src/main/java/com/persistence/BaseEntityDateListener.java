package com.persistence;

import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;

@Component
public class BaseEntityDateListener {

    @PrePersist
    public void intiEntity(BaseUserEntity baseUserEntity){



    }
}
