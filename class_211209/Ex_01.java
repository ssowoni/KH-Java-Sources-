//에러코드 수정해보자!
package class_211209;

import java.util.Scanner;//스캐너 클래스 호출

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//여기서 sc는 참조변수 해당 클래스를 대표한다.
		
		System.out.println("정수를 입력하세요:");
		int time = sc.nextInt(); 
		//처음에 Scanner 변수를 처음 언급한 타입과 다르게 지정해서라고 오류가 났다.
		// 위에서 클래스이름 객체이름 = new 클래스이름, 이 객체이름을 동일하게 언급해줘야한다
		int second = time % 60;// %는 나머지 연산자
		int minute = (time / 60) % 60; // /는 나누기 연산자 입력받은 time을 60으로 나눈다
		int hour = (time / 60) / 60;
		
		System.out.println(time + "초는");
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초입니다");

		sc.close();//close로 닫아주기!
	}

}
