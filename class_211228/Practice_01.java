package class_211228;

import java.util.HashMap;
import java.util.Scanner;

import class_211229.Student;

public class Practice_01 {
	
	HashMap <String, Student> m = new HashMap <String, Student>();

	
	m.put("박샘이", new Student(1, "010-111-1111"));
	m.put("김남윤", new Student(2, "010-111-1111"));
	m.put("박소원", new Student(3, "010-111-1111"));
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("검색할 이름은?");
		String name = sc.nextLine();
		if(name=="exit") {
			System.out.println("종료합니다.");
		break;
		}
		
		String info = m.get(name));
		if(info == null)
			System.out.println(name+ "없는 사람입니다.");
		
	}
	
	
	
	}



