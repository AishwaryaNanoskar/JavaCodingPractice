package interviewPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//read and write , 50 users  , limitation = 7 threads

public class Predicatexample {
	public static void main(String[] args) {
		Predicate<Integer> data = x -> x + x == 0;
		List<Integer> dataNew = Arrays.asList(1, 6, 4, 7);
		for (Integer i : dataNew) {
			data.test(i);
		}
		
		
//	}
//	void read() {
//		
//	}
//	void write() {
//		
//	}
//
//	@Override
//	public void run() {
//		
//		
//	}
//	
//	https://cadet/getuser/usedid=?
}
}
