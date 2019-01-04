package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		
		//옛날 벡터써보자 
		
		Vector<String> v = new Vector<String>();

		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("또치");
		
		//순회1
		int count = v.size(); //size는 옛날부터있었다.
		for(int i =0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		v.removeElementAt(2);
		
		//순회2 존나옛날방식..
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}		
	}
}
