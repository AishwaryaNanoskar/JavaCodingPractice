package streamsPracticeTwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainClass {

	public static void main(String[] args) {
		List<EmployeeDeloitee> data = new ArrayList<>();
		data.add(new EmployeeDeloitee(1, 1000));
		data.add(new EmployeeDeloitee(2, 1100));
		data.add(new EmployeeDeloitee(3, 1200));
		data.add(new EmployeeDeloitee(4, 1400));
		data.add(new EmployeeDeloitee(5, 1300));

		// 1. Sort the employees based on salary in descending order
		// Approach 1
		List<EmployeeDeloitee> emp = data.stream().sorted(Comparator.comparing(EmployeeDeloitee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println("**Sort the employees based on salary in descending order** \n" + emp);

		// Approach 2
		List<EmployeeDeloitee> sortedData = data.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println("Sort the employees based on salary in descending order: \n" + sortedData);

		// 2. Fetch the top three employee salary details
		List<EmployeeDeloitee> topThreeSalary = data.stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).limit(3).collect(Collectors.toList());
		System.out.println("Fetch the top three employee salary details: \n" + topThreeSalary);

		// 3. Fetch all employee having salary less than third highest salary
		List<EmployeeDeloitee> lessThanThird = data.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.skip(3).collect(Collectors.toList());
		System.out.println("Fetch all employee having salary less than third highest salary: \n" + lessThanThird);

	}

}
