package streamsPracticeTwo;

public class AccentureEmployeeDto {
	Integer empId;
	String empName;
	Integer age;
	String designation;
	double salary;
	Character gender;

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public AccentureEmployeeDto(Integer empId, String empName, Integer age, String designation, double salary,
			Character gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "AccentureEmployeeDto [empId=" + empId + ", empName=" + empName + ", age=" + age + ", designation="
				+ designation + ", salary=" + salary + ", gender=" + gender + "]";
	}

}
