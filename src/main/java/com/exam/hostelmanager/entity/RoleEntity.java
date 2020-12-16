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

	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column
	    private Integer roleId;

	    @Enumerated(EnumType.STRING)
	    @Basic(optional = false)
	    @Column
	    private ERole roleName;
	    
	    @ManyToMany(mappedBy = "roles")
	    private List<UserEntity> users = new ArrayList<>();

		

		public RoleEntity(String createDate, String createBy, String modifyDate, String modifyBy, Integer roleId,
				ERole roleName, List<UserEntity> users) {
			super(createDate, createBy, modifyDate, modifyBy);
			this.roleId = roleId;
			this.roleName = roleName;
			this.users = users;
		}

		public Integer getRoleId() {
			return roleId;
		}

		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

}
