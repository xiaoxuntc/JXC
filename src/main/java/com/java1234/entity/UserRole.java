package com.java1234.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 用户角色关联实体
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "t_userRole")
public class UserRole {

	@Id
	@GeneratedValue
	private Integer id; // 编号

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user; // 用户

	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role; // 角色

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
