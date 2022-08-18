package class_211210;
//a부터 z까지 나오는 프로그램을 작성하시오 do-while문 이용해서
public class Ex_14 {

	public static void main(String[] args) {
		char c ='a';
		char d ='z'+1;
		
		do {
			System.out.print(c);
			c++;
			
		}while(c!=d);
		
		/*char c= 'a';
		 * do{
		 * System.out.print(c);
		 * c = (char) (c+1);
		 * }while (c <= 'z');
		 */

	}

}
