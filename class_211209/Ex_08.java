//else-if문
package class_211209;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		char grade; //char형의 변수 grade 선언
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 (0~100): ");
		int score = scanner.nextInt();
		if ( score >= 90)
			//else-if문 시작! 만약 90이상이면 밑에 문장 출력
			grade = 'A';
		else if (score >= 80)
			//90미만인데 80이상이라면 아래 문장 출력
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else 
			//위에 어느것에도 해당되지 않는다면 F출력
			grade = 'F';
		
		System.out.println("학점은" +  grade + "입니다 ");
		scanner.close();

	}

}
