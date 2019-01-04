package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
	
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		while(q.isEmpty() == false) {
			String s = q.poll();
			System.out.println(s);
		}
		
		String s = q.poll(); //비어있는경우 널리턴 
		System.out.println(s);
		
		System.out.println("===================");
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
	}
}
