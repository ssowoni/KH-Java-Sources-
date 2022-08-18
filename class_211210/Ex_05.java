package class_211210;
//에러잡고 어떻게 조치했는지 그 상황을 적고 결과 출력
//에러코드다!
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str2 = "exit";
		//while(false)
		while(true) {//처음에 쌤이 false라고 입력해주셔서 문장 실행이 안 됐다.
			System.out.println("문자열을 입력하세요: ");
			String str = sc.nextLine();
			//if(str == "exit") //이 ==은 주소값을 비교하는 연산자
			//equals는 결과값을 비교하는 연산자
			if(str.equals(str2)) {
				//str2를 새롭게 변수선언 해주지 않아도 "exit"라고 바로 입력해도 된다.!
				break;//exit를 입력하면 while 반복문 빠져나간다
			}else {
				System.out.println(str.length()+ "글자예요");
				//length()는 공백을 포함한 글자수를 계산한다.
			}
		}
		
		System.out.println("프로그램을 종료합니다");
		sc.close();

	}

}
