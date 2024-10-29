package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<EmployeeDetailsDto> empDetails = Stream.of(
				new EmployeeDetailsDto("Aishwarya", 26, "Computer Engineer", "Female",
						Arrays.asList("aishwarya@gmail.com", "akash@gmail.com")),
				new EmployeeDetailsDto("Akash", 29, "IT Engineer", "Male",
						Arrays.asList("aishwarya@gmail.com", "akash@gmail.com")))
				.collect(Collectors.toList());

		List<String> map = empDetails.stream().map(EmployeeDetailsDto::getName).collect(Collectors.toList());
		System.out.println(map);
	}
}
