package chapter03;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aBcABCabcAac";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc",7));
	
		StringBuffer sb = new StringBuffer("");

		sb.append("Hello ");
		sb.append("World ");
		sb.append(2018);
		
		String str = "hello" + "world " + 2018; //갑자기 숫자를더해? 이렇게쓰지마라 //밑에처럼동작함 된는이유가 
//		String str2 = new StringBuffer("Hello ").append("World ").append(2018).toString(); 이게더ㄱ귀찮
		
		//주의 : + 연산자로 문자열을 더할 때
		String str3= "";
		StringBuffer sb2 = new StringBuffer("");
		for(int i = 0; i< 10000000; i++) {
//			str3 = str3 +i;//이게  +의 폐혜
//			str3 = new StringBuffer(str3).append(i).toString(); //이렇게바뀌니  new를 백만번한다. ㄷㄷ 

			sb2.append(i); //그러니 이렇게해라  
		}
		
		//format
		String name ="둘리";
		int score = 100;
		
		System.out.println(name +"님의 점수는 "+ score +"점 입니다.");
		String.format("%s님의 점수는 %d점 입니다.", name, score);
		System.out.println(str3);		
	}
	
}
