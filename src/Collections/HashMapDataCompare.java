package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDataCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		https://stackoverflow.com/questions/20969211/comparing-two-hashmaps-for-equal-values-and-same-key-sets 

		Map<String, String> data3 = new HashMap<String, String>();

		Map<String, String> data1 = new HashMap<String, String>();

		data1.put("Aishwarya", "Girl");
		data1.put("Mitali", "Girl");
		data1.put("Sona", "Girl");
		data1.put("Uttam", "Boy");

		Map<String, String> data2 = new HashMap<String, String>();

		data2.put("Aishwarya", "Girl");
		data2.put("Mitali", "Girl");
		data2.put("Sona", "Boy");
		data2.put("Uttam", "Girl");

//		Set<Entry<String, String>> entryTwo =  data2.entrySet();
//		
//		for(Map.Entry<String, String> entry: data1.entrySet()) {
//			if(entry.getKey().equals(data2) == entryTwo.)
//			
//		}

		try {
			for (String data : data1.keySet()) {
//			System.out.println(data2.get(data) +""+data1.get(data));
				if (data2.containsKey(data)) {
					if (!data2.get(data).equals(data1.get(data))) {
						data3.put(data, data1.get(data));
					}
				} else {
					System.out.println("No matching VIN.");
				}
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		System.out.println(data3);

	}

}
