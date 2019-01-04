package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");

		s.add("둘리");
		s.add("마이콜");
		s.add(s1);
		
		//리터럴로넣으면 당연히 같은객체를 가리키고있으니 같다고보는거지  그래서 new로 만들어서 테스트하는거임
		System.out.println(s.contains(s2)); //고길동이 있냐없냐 묻는거임
											//다른객체 이지만 있다고나옴 왜냐 동질성검사로하겠찌 오버라이드되어서
		
		System.out.println(s.size());
		
		String s3 = new String("고길동");
		s.remove(s3); //s에서 s3을 지워보자 
		
		//순회
		for(String str : s) {
			System.out.println(str);
		}
	}

}
