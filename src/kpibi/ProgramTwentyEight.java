package kpibi;

public class ProgramTwentyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Am Not String";
		
		//Array to check whitespace
		char inputArray[] = str.toCharArray();

		//Array to store white Space
		char[] resultArray = new char[inputArray.length];
		
		//Array without any whitespace
		char inputArrayWithoutSpace[] = str.replaceAll("\\s", "").toCharArray();

		StringBuilder data = new StringBuilder();
		
		//Loop to store white space
		for (int i = 0; i < inputArray.length; i++) {
			if (!Character.isWhitespace(inputArray[i])) {
				resultArray[i] = ' ';
			}
		}

		int z = 0;
		int j = inputArrayWithoutSpace.length - 1;
		//Wherever whitespace is not present in the 'resultArray'
		//there you will store the data
		while (j >= 0) {
			if (resultArray[z] == ' ') {
//				resultArray[z] = inputArrayWithoutSpace[j];
				data.append(inputArrayWithoutSpace[j]);
				j--;
			} else {
				data.append(' ');
			}
			z++;
		}

		System.out.println("Reverse String is: " + data);

	}

}
