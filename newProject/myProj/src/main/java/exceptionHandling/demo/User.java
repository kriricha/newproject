package exceptionHandling.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="USERS_TBL")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
@NotBlank(message = "Name is mandatory")
private String name;
@Email(message="Invalid email address")
private String email;
@Pattern(regexp= "^\\d{10}$",message="Invalid mobile number")
private String mobile;
private String gender;
@Min(18)
@Max(60)
private int age;
private String nationality;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public User(int userId, String name, String email, String mobile, String gender, int age, String nationality) {
	super();
	this.userId = userId;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.gender = gender;
	this.age = age;
	this.nationality = nationality;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
			+ gender + ", age=" + age + ", nationality=" + nationality + ", getUserId()=" + getUserId() + ", getName()="
			+ getName() + ", getEmail()=" + getEmail() + ", getMobile()=" + getMobile() + ", getGender()=" + getGender()
			+ ", getAge()=" + getAge() + ", getNationality()=" + getNationality() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
