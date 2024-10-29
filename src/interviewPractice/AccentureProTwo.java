package interviewPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {

	private long empId;
	private String name;
	private int age;
	private String designation;

	public Employee(long empId, String name, int age, String designation) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

public class AccentureProTwo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Robert", 35, "Manager"));
		empList.add(new Employee(2, "Martin", 35, "General Manager"));
		empList.add(new Employee(1, "Jack", 25, "Manager"));
		empList.add(new Employee(3, "Akshay", 20, "Developer"));
		empList.add(new Employee(1, "Arvind", 40, "Manager"));
		empList.add(new Employee(1, "Dinesh", 45, "Manager"));

//		List<Employee> tempList = empList.stream()
//				.filter(e -> "Manager".equalsIgnoreCase(e.getName()) && e.getAge() > 25).collect(Collectors.toList());
//		tempList.forEach(e -> System.out.println("Designation :- " + e.getDesignation() + " , Age :- " + e.getAge()));

		List<Employee> tempList = empList.stream()
				.filter(e -> "Manager".equalsIgnoreCase(e.getDesignation()) && e.getAge() > 30)
				.collect(Collectors.toList());

		tempList.forEach(e -> System.out.println("Emp Id :- " + e.getEmpId() + " , Age :- " + e.getAge()));
	}

}
