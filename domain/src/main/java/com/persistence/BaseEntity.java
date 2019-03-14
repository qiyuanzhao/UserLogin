package com.persistence;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public interface BaseEntity {

    Long getId();
    void setId(Long id);

}
