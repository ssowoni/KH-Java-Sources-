//ArrayList <제네릭 파라미터> 안의 랩퍼타입
package class_211230;
import java.util.ArrayList;

public class Ex_01_GenericTest {

	public static void main(String[] args) {
		//꺽쇠 안 변수 타입 생략 가능
		//↓모든 종류 다 출력 가능
		ArrayList al1 = new ArrayList<>();
		al1.add("대박");
		al1.add("금요일");
		al1.add(1);
		print(al1);
		System.out.println();
		
		//↓String 반환값만 가진다.
		ArrayList<String> al2 = new ArrayList<>(); 
		al2.add("대박");
		al2.add("금요일");
		//al2.add(1);
		print(al2);
		System.out.println();
		
		//↓Integer 반환값만 가진다.
		//다른 값 입력시 오류 생김
		ArrayList<Integer> al3 = new ArrayList<>();
		//a13.add("대박");
		//al3.add("금요일");
		al3.add(1);
		print(al3);
		System.out.println();
	}
	
	

	//이때 System.out.println() 은 메소드 이름이 길기 때문에 따로 메소드를 만들어서 활용할 수 있다.
	//이때는 static으로 해야한다. 
	static void print(ArrayList al) {
		for( int i = 0; i <al.size(); i++)
			System.out.print(al.get(i)+"\t");

}
}