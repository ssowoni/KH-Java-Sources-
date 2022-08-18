//안 보고 한번 작성해보자
package class_211221;
import java.util.Scanner;

public class Ex_02 {
	
	String title;
	String author;
	
	//접근 제어자가 default인 출력 메소드
	void show() {
		System.out.println("(" + title + "," + author + ")" + " ");
	}
	
	//클래스 이름이 동일한 생성자
	//객체 생성시 전달받은 값을 객체로 초기화하기 위해서 생성자를 사용한다.
	public Ex_02(String title, String author) {
		//this는 객체의 멤버 변수와 메소드 변수의 이름이 같은 경우
		//다른 메소드 호출시 객체 자신의 레퍼런스를 전달할 때
		//메소드가 객체 자신의 레퍼런스를 반환할 때 
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		//객체 변수를 각각 한 개씩 만드는 것이 아니라
		//배열을 활용해 하나처럼 묶을 수 있다.
		//이런 변수 묶음이 나중에 다양한 형태로 나타난다.
		//★이런 변수 묶음은 setter보다 생성자로 받으면 편하다.
		Ex_02[] book = new Ex_02[2];
		
		//변수 입력을 돕는 sc 객체 생성
		
		Scanner sc = new Scanner(System.in);
		
		//for문 활용해 정보 입력
		//book.length = 2 (배열의 크기)
		for(int i = 0 ; i < book.length; i++) {
			System.out.print("제목 >>");
			String title = sc.nextLine();
			System.out.print("저자 >>");
			String author = sc.nextLine();
			
			//입력된 데이터를 생성자 메소드를 활용해 묶음으로 입력
			//객체 생성자 
			book[i] = new Ex_02(title, author);

		}
			//for문을 통해 한 번에 출력한다. 
			for(int i = 0; i < book.length; i++) {
				book[i].show();
			}
			// system의 input, output 관련된 객체는 종료해주는 것이 좋다.
			//안해준다고 컴퓨터가 파괴되는 것은 아니지만 close() 메소드로 종료해주는 것이 좋다.
			sc.close();

	}

}
//기본 자료형 배열은 선언과 동시에 배열의 크기만큼 메모리가 할당된다.
//하지만 객체 배열의 경우 요소가 되는 객체의 주소가 들어갈 메모리만  할당된다.
//예를 들어 , 배열 5개를 선언한다고 해서 객체가 5개 만들어지는 것은 아니다.
//객체 5개가 들어갈 수 있는 주소들이 만들어 지는 것
//각 요소 객체는 직접 생성하여 저장해야 한다. 
