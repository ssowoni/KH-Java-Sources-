//복습 static() 예약어와 객체 생성의 차이 
package class_211220;

public class Ex_12 {

	//객체생성을 안하고 메소드를 활용하기 때문에
	//static을 활용해 메모리에 미리 등록 해야 사용이 가능하다.
	//main()이 start 될 때 static 예약어로 설정된 클래스 변수,
	//클래스 메소드가 자동 할당되는 공간으로 프로그램이 종료될 때 자동으로 소멸.
	//딱 한번 한 개만 할당되므로 프로그램 구동되는 동안 공유할 대상에 적용하여 이용하는 메모리
	//static은 필드와 메소드에 사용할 수 있으며, 같은 타입의 여러 객체가 공유할 목적인 대상에 적용하며, 프로그램 시작시에 정적 메모리영역에 자동 할당된다.

		static int plus(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}
	
	public static void main(String[] args) {
		
		//만약 static을 쓰지 않았다면
		//Ex_12 MTD = new ex05();
		int hap;
		//객체 생성을 안했기 때문에 메소드만 활용해서 이용한다.
		hap =/*MTD.*/plus(100,200);
		System.out.printf("100과 200의 plus() 메소드 결과는 :%d\n", hap);

	}

}
