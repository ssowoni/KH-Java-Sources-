package class_211209;

public class Ex_03 {

	public static void main(String[] args) {
		System.out.println('a'>'b');;//false
		System.out.println(3 >= 2);//true
		System.out.println(1 < 0);//false
		System.out.println(3.45 <= 2);//false
		System.out.println(3 != 2);//true
		System.out.println(!(3 != 2));//false
		
		System.out.println((3 > 2) && (3 > 4)); //true && false = false 
		System.out.println((3 != 2 ) || (-1 > 0)); // true || false = true
		System.out.println((3 != 2 ) ^ (-1 > 0)); 
		// ^는 exclusive or
		//true ^ false = true
		
		
	}

}
//ctrl + enter은 그 줄 맨 끝으로 커서 이동
//shift + enter은 다음줄로 커서 이동
