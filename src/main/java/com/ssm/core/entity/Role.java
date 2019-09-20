package com.ssm.core.entity;

import com.ssm.core.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author Joseph.L
 * @date 2019-09-02
 * @description
 */
@Entity
@Data
public class Role extends BaseEntity {

    private static final long serialVersionUID = 102192703291933836L;

    @Setter
    @Getter
    private int id;

}
