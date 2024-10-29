package interviewPractice;

import java.io.IOException;

/*Write a Java program to launch external applications like notepad, MS Word etc.
*/
public class ProgramThirtyOne {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime);
		try {
			runtime.exec("C:\\Program Files\\Notepad++\\notepad++.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
