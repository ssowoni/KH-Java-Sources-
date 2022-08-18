package class_211220;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		int x, y;
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//입력받은 값을 x, y로 지정한다. 
		System.out.print(">>");
		x = sc.nextInt();
		y = sc.nextInt();
		
		//area 객체 생성
		Ex_07Rectangel area = new Ex_07Rectangel();
		//area 객체 즉) Ex_07Rectangel 에 width 값과 height 값을 입력받은 x, y 값으로 저장
		area.width = x;
		area.height = y;
		
		//getArea() 메소드 실행 
		int result = area.getArea();
		
		System.out.println("사각형의 면적은 : " + result);
		
		sc.close();
		
	}

}
