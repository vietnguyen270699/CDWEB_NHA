package com.exam.hostelmanager.entity;

import com.exam.hostelmanager.common.ERole;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Basic(optional = false)
    @Column
    private ERole roleName;

    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();

    public RoleEntity(Long id, Date createDate, String createBy, Date modifyDate,
                      String modifyBy, ERole roleName, List<UserEntity> users) {
        super(id, createDate, createBy, modifyDate, modifyBy);
        this.roleName = roleName;
        this.users = users;
    }

    public RoleEntity(ERole roleUser) {
        super();
        this.roleName = roleUser;
    }

    public ERole getRoleName() {
        return roleName;
    }

    public void setRoleName(ERole roleName) {
        this.roleName = roleName;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

}
