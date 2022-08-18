package class_211216;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//공간인 3인 배열을 지정한다. 
		args = new String[3];
		
		//배열에 값 저장 
		args[0] = "-h";
		args[1] = "two";
		args[2] = "toto";
		
		if(args.length >0){
			//배열의 크기가 지정되지 않으면 if문이 동작하지 않는다.
			for( int i =0; i <args.length; i++)
			System.out.print(" " + args[i]);
			//배열에 저장된 데이터를 출력한다. 
		
			if( args[0].equals("-h"))
				System.out.print("HELP");
			//배열의 첫 번째 성분이 -h이면 HELP를 출력한다.
			//args[0].equals("-h") : 성분의 주소는 관계 없고 값만 같으면 true 출력
			//a==b의 경우 두 변수에 저장된 값의 값 뿐 아니라 저장된 주소의 위치도 같아야 한다. 
			//문자열에선 ==보단 equals를 주로 사용한다 ! 
			
		}
		sc.close();
	}

}
