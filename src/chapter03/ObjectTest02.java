package chapter03;

public class ObjectTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		// ==       -> 두 객체의 동일성 비교 // 즉 변수의 내용을비교
		// equals() -> 두 객체의 동질성(내용비교)
		// Object의 equals() 기본구현은 == 연산 결과와 같다.

		System.out.println(p1==p2);			// false
		System.out.println(p1.equals(p2));  // false  오버라이드안해서
		
//		--------------------------------------------------------------------
				
		String a1 = new String("abc");
		String a2 = new String("abc");

		System.out.println();
		System.out.println( a1==a2);
		System.out.println( a1.equals(a2));							 // 스트링은 오버라이드되어있다			
		System.out.println( a1.hashCode() + " :  " + a2.hashCode()); // 해쉬도 오버라이드되어있다 
		System.out.println(System.identityHashCode(a1) +" : "+ System.identityHashCode(a2) ); 

		
		String b1 = "abc";
		String b2 = "abc";
		
		System.out.println();
		System.out.println( b1==b2);
		System.out.println( b1.equals(b2));
		System.out.println( b1.hashCode() + " : " + b2.hashCode());		
		System.out.println(System.identityHashCode(b1) +" : "+ System.identityHashCode(b2) ); 
		
	}
}
