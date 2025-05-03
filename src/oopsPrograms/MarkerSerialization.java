package oopsPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class classA implements Serializable {
	int i;
	String s;

	public classA(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
}

public class MarkerSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		classA a = new classA(20, "Aishwarya");

		// Serialization
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);

		// De - serialization 'a' - Fetching the object back from the
		// bytestream (classA) ois.readObject();
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		classA b = (classA) ois.readObject();

		System.out.println(b.i + " " + b.s);

		// closing streams
		oos.close();
		ois.close();

	}
}
