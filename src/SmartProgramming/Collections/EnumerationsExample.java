package SmartProgramming.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(10);
		v.add("Aish");

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
