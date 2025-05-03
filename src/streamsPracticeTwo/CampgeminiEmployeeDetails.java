package streamsPracticeTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CampgeminiEmployeeDetails {

	public static void main(String[] args) {
		List<EmployeeDetails> data = new ArrayList<EmployeeDetails>();
		data.add(new EmployeeDetails("Aishwarya", 25, 10000));
		data.add(new EmployeeDetails("Akash", 26, 20000));
		data.add(new EmployeeDetails("XYZ", 26, 30000));
		data.add(new EmployeeDetails("Uttam", 23, 60000));

		List<EmployeeDetails> nd = data.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(nd);
	}

}
