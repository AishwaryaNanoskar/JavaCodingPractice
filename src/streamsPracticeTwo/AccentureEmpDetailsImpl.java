package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccentureEmpDetailsImpl {

	public static void main(String[] args) {
		List<AccentureEmployeeDto> data = Arrays.asList(
				new AccentureEmployeeDto(1, "Aishwarya", 26, "Developer", 20000, 'F'),
				new AccentureEmployeeDto(2, "Akash", 29, "Devops", 50000, 'M'),
				new AccentureEmployeeDto(3, "Mitali", 27, "Developer", 12000, 'F'),
				new AccentureEmployeeDto(4, "Arun", 27, "Developer", 12000, 'M'));

		List<AccentureEmployeeDto> data2 = Arrays.asList(
				new AccentureEmployeeDto(1, "Anirudh", 27, "Developer", 20000, 'M'),
				new AccentureEmployeeDto(2, "Asmita", 35, "Devops", 50000, 'F'),
				new AccentureEmployeeDto(3, "Vrinda", 45, "Developer", 12000, 'F'),
				new AccentureEmployeeDto(4, "Kamla", 34, "Developer", 12000, 'M'));

		// Find id of employee whose name starts with 'M' and age is above 25
		data.stream().filter(x -> (x.getEmpName().startsWith("M") && x.getAge() > 25)).map(x -> x.getEmpId())
				.forEach(System.out::println);

		// Find sum of salary of employees whose name starts with 'A'
		// Method 1
		data.stream().filter(x -> x.getEmpName().startsWith("A")).map(AccentureEmployeeDto::getSalary)
				.reduce((a, b) -> a + b).ifPresent(System.out::println);

		// Method 2
		double salarySum = data.stream().filter(x -> x.getEmpName().startsWith("A"))
				.mapToDouble(AccentureEmployeeDto::getSalary).sum();
		System.out.println(salarySum);

		// Employee names starting with 'A'
		System.out.println("Employee names starting with 'A' are: ");
		data.stream().filter(x -> x.getEmpName().startsWith("A")).forEach(System.out::println);

		// Merge two Employee ArrayList and sort by age in using java8 stream API
		List<AccentureEmployeeDto> dataNew = Stream.concat(data.stream(), data2.stream())
				.sorted(Comparator.comparingInt(AccentureEmployeeDto::getAge)).collect(Collectors.toList());
		System.out.println("Merge two Employee ArrayList and sort by age in using java8 stream API: " + dataNew);

		// Sort employee by name and salary
		System.out.println("--Sort employee by name and salary--");
		data.stream().sorted(
				Comparator.comparing(AccentureEmployeeDto::getEmpName).thenComparing(AccentureEmployeeDto::getSalary))
				.forEach(System.out::println);

		// Sort Employee based on gender and age is above 30
		System.out.println("--Sort Employee based on gender and age is above 30--");
		data2.stream().filter(x -> x.getAge() > 30).sorted(Comparator.comparing(AccentureEmployeeDto::getEmpName))
				.forEach(System.out::println);
	}
}
