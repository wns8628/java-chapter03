package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
//		Calendar cal = new Calendar(); 추상이라 안됨 이게 

		//1번방법
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//2번방법
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11); //month(12)-1
		cal.set(Calendar.DATE,25);
		printDate(cal);
		
		//3번방법
		cal.set(2007,10,18); //month(11) -1
		printDate(cal);
		
		cal.add(Calendar.DATE, 1000); //1000일뒤를구한다. 
		printDate(cal);
	}
	
	public static void printDate(Calendar cal) {
		String[] days= {"일", "월", "화","수","목","금","토"};
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월(0~11, +1)
		int month = cal.get(Calendar.MONTH);
		
		//일
		int date = cal.get(Calendar.DATE);
		
		//요일 : 1(일요일) ~7(토요일) 0이없다
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//시
		int hour = cal.get(Calendar.HOUR);
		
		//분
		int minute = cal.get(Calendar.MINUTE);
		
		//초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
			year + "년 " + 
			(month+1) + "월 " +
			date + "일 " +
			days[day-1] + "요일" +
			hour + "시 " +
			minute + "분 " +
			second + "초" );
	}
}
