package class_211229;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_07_HashMap01 {

	public static void main(String[] args) {
		//Map 객체도 자료구조형의 한 종류이고
		//키 - 값의 형태로 자료를 저장한다
		//그렇기 때문에 저장된 변수의 번호나 이런 것들이 중요하지 않다.
		//HashMap 클래스는 대용량 자료를 검색하는데 뛰어난 능력을 발휘한다.
		
		HashMap<String, String> dic = new HashMap<>();
		//put 메소드를 활용해 키 - 값의 형태로 데이터를 저장한다. 
		dic.put("baby" , "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		//Scanner 변수를 통해 데이터를 입력받음,
		Scanner scanner = new Scanner(System.in);
		//while 내부에 true를 써 무한루프를 만든다.
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String eng = scanner.next();
			//if문을 활용해 조건을 만족하면 while문을 탈출하고 종료
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			//영문명(key)를 통해 조회, 맞는 것이 있으면 한글(Value)로 출력
			//eng = 입력받은 값 
			//V get(Object key) : 주어진 키에 있는 값을 리턴합니다.
			String kor = dic.get(eng);
			if(kor == null )
				System.out.println(eng + "는 없는 단어입니다.");
			else 
			//get으로 key값을 받아오면 value 값이 출력되는 시스템!
			System.out.println(kor);
			
		}
		//Scanner 객체는 close() 메소드를 활용해 종료시켜 줘야한다

		scanner.close();	
	}

}
