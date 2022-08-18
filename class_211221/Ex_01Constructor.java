package class_211221;
//Ex_01Constructor2랑 같은데 이건 내가 작성해본것
public class Ex_01Constructor {
	//클래스 필드 선언
	//전역변수
	int radius;
	
	//생성자 생성
	//객체 생성시 전달받은 값을 객체로 초기화하기 위해서 생성자를 사용한다. 
	public Ex_01Constructor(int radius) {
		this.radius = radius;
	}
	
	double getArea(){
	return 3.14 * radius * radius;
	}
}
