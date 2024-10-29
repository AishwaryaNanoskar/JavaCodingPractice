package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {
		//Program to check the time taken to add elements in an ArrayList and LinkedList

		ArrayList<Integer> list = new ArrayList<>();
		long now = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			list.add(0, i);
		}

		System.out.println("Array List time: " + (System.currentTimeMillis() - now));

		LinkedList<Integer> listLinked = new LinkedList<>();
		long nowLinked = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			listLinked.addFirst(i);
		}

		System.out.println("Linked list time: " + (System.currentTimeMillis() - nowLinked));
		
		ArrayList a2 = new ArrayList();
		a2.add(1);
		a2.add("Paggu");
		
		list.addAll(a2);
		System.out.println(list);

		
	}

}
