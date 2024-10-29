package Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String sr[]) throws Exception {

		Stack<String> value = new Stack<>();
		value.push("Aish");
		value.push("Sona");
		value.push("Katty");
		value.push("Mummy");

		while (!value.isEmpty()) {
			System.out.println("" + value.pop());
		}
	}
}
