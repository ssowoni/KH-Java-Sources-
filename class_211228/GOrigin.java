package class_211228;

public class GOrigin<T> {
	
	T data;
	
	public void set(T n) {
		data = n;
	}
	//getData 자료형 자리에 void 입력해야 된다.
	public void getData() {
		
		System.out.println(data);
	}
}

//클래스명 뒤에 오는 꺽쇠<T>로 표현하면
//클래스 내부의 모든 T는 인수로 부터 전달된 랩퍼 클래스 타입으로 변경된다.