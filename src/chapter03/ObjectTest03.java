package chapter03;

public class ObjectTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(10 , 20);
		System.out.println(r1);
		
		Rect r2 = new Rect(20, 10);
		System.out.println(r2.equals(r1)); //오버라이드해줘라

		// equals 좋은코드 
		String s = null;
		System.out.println(equalHello(s));
//		System.out.println(s.equals("as")); //이건 널이라 익셉션에러난다. ㅇㅋ?
	}	
	
	public static boolean equalHello(String s) {
		return "Hello".equals(s);	      //그래서 이렇게해야 널에러가안나지
	}
	
}
