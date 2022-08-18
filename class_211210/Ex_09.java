package class_211210;

import java.util.Calendar;
import java.util.Date; 
//import부분 다시 공부하자
//보통 프로그래밍에선 util보다 sql을 더 많이 사용한다.

public class Ex_09 {

	public static void main(String[] args) {
		Date d = new Date();
		//오늘 날짜 출력한다. 요일, 달, 일, 시간, 연도
		System.out.println(d);//1
		
		Calendar c = Calendar.getInstance();
		//Calendar는 추상클래스여서 new명령문을 사용 못 하고 getInstance() 메소드 사용
		
		System.out.println(c.get(Calendar.YEAR));//현재 몇년도인지
		System.out.println(c.get(Calendar.MONTH)+1);//현재 몇월인지
		//0부터 시작, 1월은 0
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//현재 며칠인지
		System.out.println(c.get(Calendar.HOUR));//현재 몇시인지
		System.out.println(c.get(Calendar.MINUTE));//현재 몇분인지
		
		c.clear(); //현재 시스템 날짜, 시간 정보를 지운다
		c.set(2020, 3, 19); //set메소드 날짜, 시간 정보 설정
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("날짜 정보 :" + year + "/" + month + "/" +day);
				

	}

}
