//직접 코드 작성해보기!
package class_211228;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_13_ArrayList {

	public static void main(String[] args) {
		//ArrayList 객체 변수 생성
		//String인자를 넘겨서 
		//String 타입의 ArrayList 를 리턴받는다는 객체 a 생성
		ArrayList<String> a = new ArrayList<String>();
		//데이터를 입력받기 위해 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		//for문을 활용해 4개의 데이터 입력
		for(int i=0; i <4; i++) {
			System.out.print("이름을 입력하세요 >>");
			String s = scanner.next();
			//↓ArrayList 객체 변수인 a에 입력받은 값을 넣는다.
			a.add(s);
		}
		//입력정보 출력
		//↓a에는 총 4개의 값이 들어있는 것 따라서 size = 4
		for(int i = 0; i< a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		int longestIndex = 0;
		//입력값이 가장 긴 문자를 찾아냄 
		for(int i=0; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				//get(longestIndex) = i; 이말은 즉슨 get(index) 값을 추출한다. 
				//i의 값을 longestIndex에 대입한다.
				longestIndex = i;
		}
		System.out.println("\n가장 긴 이름은: " + a.get(longestIndex));
		scanner.close();
	}

}
/*
 * ArrayList<String> name = new ArrayList<String>(); Scanner sc = new
 * Scanner(System.in);
 * 
 * for(int i =0; i <4; i++) { System.out.print("이름을 입력하세요: "); String
 * name_length = sc.nextLine(); name.add(name_length); } for(int j =0; j <4;
 * j++) System.out.println(name.get(j));
 * 
 * 
 * String name_long = name.get(0);
 * 
 * 
 * for(int k =0; k <4; k++) { if(name_long.length() < name.get(k).length())
 * name_long = name.get(k); }
 * 
 * System.out.println("가장 길이가 긴 이름은?: " + name_long);
 */

