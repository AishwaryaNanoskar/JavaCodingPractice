package oopsPrograms;

public class StaticVariable {
	int empId;
	String name;

	static String comName = "TCS"; // Static variable which cannot be changed

	public StaticVariable(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	void display() {
		System.out.println("Employee ID: " + empId + "\nEmployee Name: " + name + "\nCompany Name: " + comName);
	}

	public static void main(String[] args) {
		StaticVariable st = new StaticVariable(1, "Aishwarya");
		st.display();
		StaticVariable st2 = new StaticVariable(2, "Akash");
		st2.display();
	}
}
