package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();  //쓰는게비슷하니 이것만 바꿔줬음 근데다르지
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		// 순회
		int count = list.size();
		
		for(int i=0; i < count; i++) {
			String s =  list.get(i);
			System.out.println(s);
		}
		
		list.remove(1);
		
		System.out.println("====================");
		
		
		//순회2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		while(it.hasNext()) {		//다시못씀 한번돌면끝
			String s = it.next();
			System.out.println("->" + s);
		}
		
		System.out.println("====================");
		
		//순회3(for ~ each)  이게 훨쉽지 
		for(String s : list) {
			System.out.println(s);
		}
	}

}
