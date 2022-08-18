/*신입생에게 임의의 학번을 부여하는 프로그램을 작성하라
 * 신입생으로부터 이름과 생년월일을 입력 받은 후 임의의 학번을 생성하고
 * 이름, 생년월일과 학번을 출력해야한다.
 * 생년월일은 yyyy/mm/dd의 형태로 입력해야 한다.
 * yyyy는 연도를 나타내고 mm은 월, dd는 일을 나타낸드.
 * 1월부터 9월까지는 한 자리 숫자이고 10월부터 12월 까지는 두자리 숫자이다.
 * 1일부터 9일까지는 한자리 숫자이고 10일부터 31일까지는 두자리 숫자이다.
 * 학번은 17로 시작하고 17xxxx의 형태를 취한다
 * 학번은 xxxx는 1000부터 1009까지의 정수여야 한다.
 * substring(), indexOf() 사용해야한다.
 *  /는 indexOf()를 사용해서 받아야 한다. 
 * birthdate, num, year, rest, Random generator = new Random();
 * randomnumber, days
 * 출력결과
 * 이름입력 : 박샘이
 * 이름은 박샘이,
 * 생년월일 입력 (ex 1988/7/28) : 1991/11/25
 * 1991년 11월 25일 학번 : 170008
 */


package class_211209;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//스캐너 객체 생성
		Random generator = new Random();//랜덤 객체 생성
		

		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();//문자열로 이름을 입력 받는다
		System.out.println("이름은 " + name +",");
		System.out.print("생년월일을 입력하세요 (ex.1997/10/23): ");
		String birthdate = sc.nextLine();//문자열로 생일을 입력받는다.
		
		
		
		int randomnumber;
		randomnumber = generator.nextInt(10)+171000;//랜덤으로 난수를 생성하는 코드인데
		//nextInt(10)은 0과 9사이에 있는 난수를 반환하는데 학번이 처음은 17로 시작해야 하고 1000~1009 사이의 숫자가 나와야 함으로 171000을 더해줬다. 
		System.out.println(birthdate.substring(0, 4)+ "년" + birthdate.substring(5,7) +"월"+ birthdate.substring(8, 10)+ "일" );
		//생년월일은 1번째부터 4번째 있는 문자를 반환
		//월은 6번째부터 7번째 자리에 있는 문자를 반환
		//일은 9번째부터 10번째 자리에 있는 문자를 반환한다.
		System.out.println("학번: " + randomnumber);
		
		
		sc.close();
		
	}

}
