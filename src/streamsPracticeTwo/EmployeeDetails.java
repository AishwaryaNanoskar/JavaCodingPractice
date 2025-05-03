package streamsPracticeTwo;

public class EmployeeDetails {

	String name;

	Integer age;

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	double salary;

	public EmployeeDetails(String name, Integer age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
