//scanner
package class_211208;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("이름 도시 나이 체중 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next(); //문자열 열기
		System.out.println("이름은" + name + ",");
		
		String city = scanner.next();//문자열 열기
		System.out.println("도시는" + city +",");
		
		int age = scanner.nextInt();//문자열 열기
		System.out.println("나이는" + age + "살,");
		
		double weight = scanner.nextDouble();//문자열 열기
		System.out.println("몸무게는" + weight + ",");
		
		boolean single = scanner.nextBoolean();//문자열 열기
		System.out.println("독신 여부는" + single + "입니다."); //boolean형이기에 true false로 적어야 한다
		
		scanner.close(); //닫아주는 게 원칙이다.

	}

}
//창나누기 세로 분할 ctrl + shift + [
//창나누기 가로 분할ctrl + shift + _(언더바)

