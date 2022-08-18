//오늘의 과제 
package class_211220;

public class Ex_01tv3 {

	public static void main(String[] args) {
		//myTv 객체를 생성하고 데이터를 입력한다.
		Ex_01television3 myTv = new Ex_01television3();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		
		//myTv의 channel 값 받아들인다.
		int ch = myTv.getChannel();
//		//my.Tv channel 값 출력
		System.out.println("현재 채널은" + ch + "입니다.");
	
		//tv 객체 생성
		Ex_01television3 tv = new Ex_01television3();
		//tv 객체에 저장된 값은 없으므로 출력값도 없다
		tv.print();

		
	}

}//tv 클래스는 myTv와 구조는 같지만 내부 데이터는 다른 변개의 인스턴스
