package org.nhongphong.hc.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="role")
public class Role {
	private String roleName;
	private String desciption;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	
}
