package StringPrograms;

public class RotationalStrings {
	public static void main(String[] args) {
		String str1 = "avajava";
		String str2 = "javaava";

		String str3 = str1 + str2;
		
		if (str3.contains(str1))
			System.out.println("Rotational string");
		else
			System.out.println("Not Rotational string");
	}
}
