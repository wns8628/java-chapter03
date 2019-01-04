package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> m =
				new HashMap<String, Integer>();

		m.put("one", 1); //기본저긍로 객체가들어가야함 즉 오토박싱 
		m.put("two",2);
		m.put("three",3);
		
		int i = m.get("two"); //auto unboxing
		System.out.println(i);
		
		m.put("three",33333); //키를 똑같이쓴다?
		
		System.out.println(m.get("three")); //덮어쓰네
		
		
		//순회 
		Set<String> keys = m.keySet();
		for(String key :keys) {
			m.get(key);
			int value = m.get(key);
			System.out.println(value);
		}
	}
}
