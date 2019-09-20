package com.ssm.core.entity;

import com.ssm.core.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cache.annotation.Cacheable;

import javax.persistence.Entity;

/**
 * @author Joseph.L
 * @date 2019-09-02
 * @description
 */
@Entity
@Data
@Cacheable
public class User extends BaseEntity {

    private static final long serialVersionUID = 8714560248831178768L;

    @Setter
    @Getter
    private int id;

    @Setter
    @Getter
    private String userCode;

    @Setter
    @Getter
    private String userName;

    @Setter
    @Getter
    private String password;

    @Setter
    @Getter
    private String salt;
}
