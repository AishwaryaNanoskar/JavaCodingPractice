package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> values = new LinkedList<>();
		values.add("Aish");
		values.add("Tina");
		values.add("Sona");

		for (String s : values)
			System.out.println("" + s);

	}

}
