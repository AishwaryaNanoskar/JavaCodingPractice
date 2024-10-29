package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put(101, "Aish");
		map.put(102, "Sona");  
		
//		map.clear();
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Sona"));
		
		//"get" method returns the corresponding value to key
		System.out.println(map.get(102));

		System.out.println(map);

	}

}
