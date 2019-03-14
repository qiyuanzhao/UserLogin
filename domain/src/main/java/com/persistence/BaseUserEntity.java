package com.persistence;


import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseUserEntity extends BaseSqlEntity{

    @Enumerated(value = EnumType.STRING)
    private EntityStatus status = EntityStatus.ACTIVE;

    @CreatedDate
    private Date createdTime;
    @CreatedBy
    private Date createdBy;
    @LastModifiedDate
    private Date LastModifiedDate;
    @LastModifiedBy
    private Date LastModifiedBy;


    @JsonIgnore
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public Date getLastModifiedDate() {
        return LastModifiedDate;
    }

    public Date getLastModifiedBy() {
        return LastModifiedBy;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }

    public void setLastModifiedBy(Date lastModifiedBy) {
        LastModifiedBy = lastModifiedBy;
    }
}
