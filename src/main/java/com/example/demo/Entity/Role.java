package com.example.demo.Entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role_tbl")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private int rid;
	
	@Column(name = "role_name")
	private String rname;
	
	@ManyToMany(mappedBy = "roles")
	private Collection<User> users;
	
	public Collection<User> getUser() {
		return users;
	}

	public void setUser(Collection<User> users) {
		this.users = users;
	}

	public Role() {}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Role(int rid, String rname) {
		super();
		this.rid = rid;
		this.rname = rname;
	}
	
}
