package chapter03;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // reference value x (레퍼런스 변수에 저장되어있다)
							              // address x 
									      // address 기반의 hashing값 
		
		System.out.println(p);
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
		
	}
}
