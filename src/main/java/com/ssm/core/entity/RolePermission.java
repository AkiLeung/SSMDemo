package com.ssm.core.entity;

import com.ssm.core.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author Joseph.L
 * @date 2019-09-12
 * @description
 */
@Entity
@Data
public class RolePermission extends BaseEntity {

    private static final long serialVersionUID = -48267512760495703L;

    @Setter
    @Getter
    private int id;

}
