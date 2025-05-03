package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentDetails {
	public static void main(String[] args) {

		List<Students> data = Arrays.asList(
				new Students(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
				new Students(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
				new Students(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
				new Students(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
				new Students(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
				new Students(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Delhi", 90),
				new Students(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
				new Students(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
				new Students(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
				new Students(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

		// List of students whose names starts with "A"
		List<Students> list = data.stream().filter(x -> x.getFirstName().startsWith("A")).collect(Collectors.toList());
		System.out.println("List of students whose names starts with A: " + list);

		// Group The Student By Department Names
		Map<String, List<Students>> groupByDepartmentName = data.stream()
				.collect(Collectors.groupingBy(Students::getDepartmantName));
		System.out.println("Group The Student By Department Names: " + groupByDepartmentName);

		// Find the total count of student using stream
		long count = data.stream().count();
		System.out.println("Find the total count of student using stream: " + count);

		// Find the max age of student
		Integer maxAge = data.stream().map(Students::getAge).sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println("The max age of student is: " + maxAge);

		// Find all departments names
		List<String> departmentNames = data.stream().map(Students::getDepartmantName).distinct()
				.collect(Collectors.toList());
		System.out.println("Find all departments names: " + departmentNames);

		// Find the count of student in each department
		Map<String, Long> studentCount = data.stream()
				.collect(Collectors.groupingBy(Students::getDepartmantName, Collectors.counting()));
		System.out.println("Find the count of student in each department: " + studentCount);

		// Find the list of students whose age is less than 30
		List<Students> ageLessThan30 = data.stream().filter(x -> x.getAge() < 30).collect(Collectors.toList());
		System.out.println("Find the list of students whose age is less than 30: " + ageLessThan30);

		// Find the list of students whose rank is in between 50 and 100
		List<Students> rank = data.stream().map(x -> {
			if (x.getRank() > 50 && x.getRank() < 100) {
				x.getFirstName();
			}

			return x;
		}).collect(Collectors.toList());
		System.out.println("Find the list of students whose rank is in between 50 and 100: " + rank);

		// Find the average age of male and female students
		Map<String, Double> average = data.stream()
				.collect(Collectors.groupingBy(Students::getGender, Collectors.averagingInt(Students::getAge)));
		System.out.println("Find the average age of male and female students: " + average);

		// Find the department who is having maximum number of students
		Entry<String, Long> entry = list.stream()
				.collect(Collectors.groupingBy(Students::getDepartmantName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		System.out.println("Find the department who is having maximum number of students: " + entry);

		// Find the Students who stays in Delhi and sort them by their names
		List<Students> sortedData = data.stream().filter(x -> x.getCity().equals("Delhi"))
				.sorted(Comparator.comparing(Students::getFirstName)).collect(Collectors.toList());
		System.out.println("Find the Students who stays in Delhi and sort them by their names: " + sortedData);

		// Find the average rank in all departments
		Map<String, Double> averageRank = data.stream().collect(
				Collectors.groupingBy(Students::getDepartmantName, Collectors.averagingInt(Students::getRank)));
		System.out.println("Find the average rank in all departments: " + averageRank);

		// Find the highest rank in each department
		Map<String, Optional<Students>> studentData = data.stream().collect(Collectors
				.groupingBy(Students::getDepartmantName, Collectors.minBy(Comparator.comparing(Students::getRank))));
		System.out.println("Find the highest rank in each department: " + studentData);

		// Find the list of students and sort them by their rank
		List<Students> sortedByRank = data.stream().sorted(Comparator.comparing(Students::getRank))
				.collect(Collectors.toList());
		System.out.println("Find the list of students and sort them by their rank: " + sortedByRank);

		// Find the student who has second rank
		Students student = data.stream().sorted(Comparator.comparing(Students::getRank)).skip(1).findFirst().get();
		System.out.println("The student who has second rank is: " + student);

	}
}
