package collection;

import java.util.Stack;
import java.util.Vector;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vector<String> s = new Stack<String>();
		Stack<String> stack = new Stack<String>();
		 
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");
		
		while(stack.isEmpty()==false) {
			String value = stack.pop();
			System.out.println(value);
		}

		//비어있으면 예외발생
//		stack.pop();
	
		System.out.println("==================");
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	
	}
}
