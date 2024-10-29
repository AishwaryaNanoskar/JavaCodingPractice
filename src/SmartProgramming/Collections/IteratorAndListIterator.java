package SmartProgramming.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAndListIterator {
	public static void main(String ar[]) throws Exception {
		List l = new ArrayList();
		l.add(1);
		l.add("Aish");

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
