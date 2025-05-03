package streamsPracticeTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CampgeminiEmployeeDepartment {
	public static void main(String[] args) {

		List<Employee> data = new ArrayList<Employee>();
		data.add(new Employee("Aishwarya", 25, "Female", "HR"));
		data.add(new Employee("Akash", 26, "Male", "IT"));
		data.add(new Employee("XYZ", 26, "Female", "HR"));
		data.add(new Employee("Uttam", 55, "Male", "IT"));

		System.out.print("Distinct departments: ");
		data.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		// Approach 1
		long count = data.stream().map(Employee::getDepartment).distinct().count();

		// Approach 2
		Map<String, Long> approach2 = data.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("The count of departments is by Approach 2: " + approach2);

		// Average age of male and female employee
		Map<String, Double> avg = data.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println("Average is: " + avg);
	}
}
