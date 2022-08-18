package class_211217;

public class Ex_10_1 {


	public static void main(String[] args) {
		//myTv 객체 생성
		
		Ex_10_1television2 myTv = new Ex_10_1television2();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
		
		
		//yourTv 객체 생성
		Ex_10_1television2 yourTv = new Ex_10_1television2();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
		
	}
	
	//객체 변수의 원형 클래스는 동일하지만 저장된 데이터는 다르다.
	//이는 int형 변수라도 변수명에 따라 저장된 데이터가 다른 것과 마찬가지다.
	//객체 역시 변수의 한 형태라는 것을 알 수 있다. 
}

class Ex_10_1television2 {
	//필드 (클래스 내 변수)
	
	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.println("텔리비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다");
	}
}

		
		
	