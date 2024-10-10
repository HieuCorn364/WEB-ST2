package vn.iostar.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String fullName;
	private String userName;
	private String passWord;
	private String sex;
	private String phone;
	private String address;
	private String email;
	private Integer roleId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public UserEntity() {
		super();
	}
	public UserEntity(Integer id, String fullName, String userName, String passWord, String sex, String phone,
			String address, String email, Integer roleId) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.userName = userName;
		this.passWord = passWord;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.roleId = roleId;
	}
	
	public UserEntity(String fullName, String userName, String passWord, String address, Integer roleId) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.passWord = passWord;
		this.address = address;
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", passWord=" + passWord
				+ ", sex=" + sex + ", phone=" + phone + ", address=" + address + ", email=" + email + ", roleId="
				+ roleId + "]";
	}
	
	

}
