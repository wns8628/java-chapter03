package chapter03;

public class StringTest {

	public static void main(String[] args) {
		// c:\temp
		// /temp(unix) <-> d:\temp(window)
		String s1 = "c:\\temp";
		
		// "Hello"
		String s2 = "\"Hello\"";
		
		System.out.println(s1);
		System.out.println(s2);
		
		// \t -> tab
		// \n -> new line
		// \r -> carriage return
		
		System.out.println("Hello\tWorld\n");
		System.out.println("Hello\tWorld");
		
		// ''
		char c = '\'';
		System.out.println(c);
	}
}
