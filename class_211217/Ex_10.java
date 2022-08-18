//프로그래밍 언어란 컴퓨터 시스템을 동작시키기 위한 프로그램 작성 언어를 말한다. 
package class_211217;

class Ex_10tv{
	//필드만 존재한다
	int channel;
	int volume;
	//boolean 타입은 true/false 두 가지 
	boolean onOff;
}


public class Ex_10 {

	public static void main(String[] args) {
		//메인 클래스 생성
		//같은 패키지 내부 Ex10_tv 클래스 객체 활용
		//(복습) 같은 패키지 내 다른 클래스는 import 불 필요
		
		Ex_10tv tv = new  Ex_10tv();
		
		//객체에 변수 저장
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		//만약에 false면? 
		System.out.println("텔리비전의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "입니다");
		
		
	}

}
