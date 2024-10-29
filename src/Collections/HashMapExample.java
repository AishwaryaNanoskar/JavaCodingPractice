package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> value = new HashMap<Integer, String >();
		
		value.put(101, "Amit");
		value.put(102, "Aish");
		value.put(103, "Sona");
			
		System.out.println(value);
		
		for(Map.Entry me: value.entrySet()) {
			
		}		
	//		Set data = value.entrySet();
	//		
	////		System.out.println(data);
	//		
	//		Iterator itr = data.iterator();
	//		while (itr.hasNext()) {
	////			System.out.println(itr.next());
	//			Map.Entry entry = (Map.Entry) itr.next();
	//			System.out.println(entry.getKey()+" -> "+entry.getValue());
	//			
	//		}
	//
		}

}
