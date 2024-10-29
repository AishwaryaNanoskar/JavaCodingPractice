package java8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPaymentFunctionalnterface {
	String doPayment(String source, String dest);

	default double getScrachCard() {
		return new Random().nextDouble();
	}

	static String datePatterns(String patterns) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
		return dateFormat.format(new Date());
	}
}
