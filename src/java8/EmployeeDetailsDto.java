package java8;

import java.util.List;

public class EmployeeDetailsDto {
	String name;
	Integer age;
	String department;
	String gender;

	List<String> emailId;

	public EmployeeDetailsDto(String name, Integer age, String department, String gender, List<String> emailId) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.gender = gender;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getEmailId() {
		return emailId;
	}

	public void setEmailId(List<String> emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "EmployeeDetailsDto [name=" + name + ", age=" + age + ", department=" + department + ", gender=" + gender
				+ ", emailId=" + emailId + "]";
	}

}
