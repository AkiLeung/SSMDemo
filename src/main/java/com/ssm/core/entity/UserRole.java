package com.ssm.core.entity;

import com.ssm.core.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author Joseph.L
 * @date
 * @description
 */
@Entity
@Data
public class UserRole extends BaseEntity {

    private static final long serialVersionUID = -400147828019022523L;

    @Setter
    @Getter
    private int id;

}
