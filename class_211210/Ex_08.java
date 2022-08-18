package class_211210;

import java.time.LocalTime;//import는 몇개가 있던지 상관 없다

public class Ex_08 {

	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
		
		int time = currentTime.getHour();
		
		if(time < 11) {//11시 이전에는 morning
			System.out.println(currentTime + "\n" + "Good morning");
		} else if (time <15) {//11시 이후 오후 3시 이전에는 afternoon
			System.out.println(currentTime + "\n" + "Good afternoon");
		} else if (time < 20) {//오후 3시 이후 오후 8시 이전에는 evening
			System.out.println(currentTime + "\n" + "Good evening");
		} else {//저녁 8시 이후에는 night
			System.out.println(currentTime + "\n" + "Good night");
		}
		
	}

}
