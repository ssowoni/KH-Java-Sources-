/*각 과목에 대해 과목명과 평가 요소들의 점수들을 입력받아 총점을 계산하고 학점을 부여한다.
 * 그 다음 평점( 학점 평균)을 계산한다.
 * 사용자가 키보드에 입력하는 데이터를 읽기 위해서 Scanner 클래스를 사용한다
 * 각 과목의 이름과 평가 요소들의 점수들을 저장하는 변수들을 선언한다. 
 * 각 과목의 총점과 학점 그리고 평점을 저장하는 변수들과 그 밖에 필요한 변수들을 선언한다.
 * 키보드로부터 입력하는 데이터를 읽기 위한 scanner 객체를 만든다.
 * 사용자가 계속하기를 원한다면 반복한다.
 *사용자로부터 과목의 이름과 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다. 그리고 입력된 점수를 읽는다.
 *태도, 과제, 수시, 중간시험, 기말시험점수가 각 평가 요소이다.
 *과목의 총점을 계산하고 출력한다. 
 *과목의 학점을 결정한다 학점은 내 맘대로 정하면 된다.! 
 *과목의 이름과 학점을 출력한다. 
 * 
 * 
 */
package class_211213;

import java.util.Scanner;

public class Task_wednesday_01 {

	public static void main(String[] args) {
		
		String coursename ;//과목이름
		char grade;//학점
		String flag; //반복문 종료할건지 y, n 의 값을 판단한다
		int attendscore, assignmentscore, quizscore, midtermexamscore, finalexamscore;
		//출석점수, 과제점수, 수시시험점수, 중간시험점수, 기말시험점수
		double totalscore, average; // 총점, 평점
		
		Scanner sc = new Scanner(System.in);
		
		//사용자가 계속하기를 원한다면 반복한다.
		do {//사용자로부터 과목의 이름과 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다. 
			//그리고 입력된 점수를 읽는다.
			
			System.out.print("과목의 이름을 입력하세요:\t");
			coursename = sc.next();
			System.out.print("출석점수를 입력하세요 :\t\t");
			attendscore = sc.nextInt();
			System.out.print("과제점수를 입력하세요 :\t\t");
			assignmentscore = sc.nextInt();
			System.out.print("수시시험점수를 입력하세요 :\t\t");
			quizscore = sc.nextInt();
			System.out.print("중간시험점수를 입력하세요 :\t\t");
			midtermexamscore = sc.nextInt();
			System.out.print("기말시험점수를 입력하세요 :\t\t");
			finalexamscore = sc.nextInt();
			
			//과목의 총점을 계산한다. 
			totalscore = attendscore * 0.1 + assignmentscore * 0.4 
					+ quizscore * 0.1 + midtermexamscore * 0.2 + finalexamscore * 0.2;
			
			//과목의 총점을 출력한다. 
			System.out.println("과목" + coursename + "의 총점 : \t" + totalscore );
			
			//학점과 평점을 결정한다.
			
			if (totalscore>= 90) {
				//만약 총점이 90점보다 높으면 'A'학점에 평점은 4.0
				grade = 'A';//세미콜론 안 찍어서 오류났다!!!!
				average = 4.0;
			}
			else if (totalscore >=80) {
				//만약 총점이 80점보다 높으면 'B'학점에 평점은 3.0
				grade = 'B';
				average = 3.0;
			}
			else if (totalscore >=70) {
				grade = 'C';
				average = 2.0;
			}
			else if (totalscore >=60) {
				grade = 'D';
				average = 1.0;
			}
			else {
				grade = 'F';
				average = 0;
			}
			
			
			
			//과목의 학점을 출력한다.
			System.out.printf("과목%s의 학점: %c \n", coursename, grade);
			
			//계속하기를 원하는지 예(y) 혹은 아니오 (n)를 입력하라고 요청하고 그 값을 읽는다
			System.out.printf("계속하기를 원하세요? 그렇다면 y 아니면 n를 입력하세요:");
			flag =sc.next();
			
		}while(flag.equals("y"));
		
		
		
			System.out.println("평점: \t " +average);
		sc.close();

	}

}
