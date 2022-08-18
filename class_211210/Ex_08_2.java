package class_211210;

import java.util.Calendar;

public class Ex_08_2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int currenHour = cal.get(Calendar.HOUR_OF_DAY);
		//날짜와 시간 정보를 가지고 오는 Calendar의 get() 메소드 사용
		
		if(currenHour< 11) {//11시 이전에는 morning
			System.out.println(currenHour + "\n" + "Good morning");
		} else if (currenHour <15) {//11시 이후 오후 3시 이전에는 afternoon
			System.out.println(currenHour + "\n" + "Good afternoon");
		} else if (currenHour < 20) {//오후 3시 이후 오후 8시 이전에는 evening
			System.out.println(currenHour + "\n" + "Good evening");
		} else {//저녁 8시 이후에는 night
			System.out.println(currenHour + "\n" + "Good night");
		}

	}

}
