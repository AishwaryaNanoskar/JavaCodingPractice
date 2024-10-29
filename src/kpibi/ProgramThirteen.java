package kpibi;

public class ProgramThirteen {

	public static void main(String[] args) {
		int num = 145;
		String target = "4";

		while (num != 0) {
			String str = String.valueOf(num);
			if (!str.contains(target)) {
				break;
			} else {
				num--;
			}
		}
		System.out.println(num);
	}

}
