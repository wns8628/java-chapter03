package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Money> s = new HashSet<Money>();
		
		s.add(new Money(1));
		s.add(new Money(2));
		s.add(new Money(3));
		s.add(new Money(1));

		for(Money m : s) {
			System.out.println(m);
		}

	}
}
