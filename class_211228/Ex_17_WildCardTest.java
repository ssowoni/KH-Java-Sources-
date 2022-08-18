//제네릭의 타입 범위 제한
package class_211228;
import java.util.Arrays;
import java.util.List;

public class Ex_17_WildCardTest {

	public static void main(String[] args) {
		Integer[] inum = {1, 2, 3, 4, 5};
		//Integer타입의 배열을 inum에 저장
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		//Double 타입의 배열을 dnum에 저장
		String [] snum = {"1", "2","3", "4", "5"};
		//String 타입의 배열을 snum에 저장
		List<Integer> iList = Arrays.asList(inum);
		//List<Integer> iList는 제너릭 타입으로 inum을 포함하는 asList배열을 참조하는 변수
		//Array.asList() 메소드는 인자로 전달한 배열을 리스트 객체로 변환하여 반환
		List<Double> dList = Arrays.asList(dnum);
		//List<Double> dList는 제너릭 타입으로 dnum을 포함하는 asList배열을 참조하는 변수
		//Array.asList() 메소드는 인자로 전달한 배열을 리스트 객체로 변환하여 반환
		List<String> sList = Arrays.asList(snum);
		//List<String> dList는 제너릭 타입으로 snum을 포함하는 asList배열을 참조하는 변수
		//Array.asList() 메소드는 인자로 전달한 배열을 리스트 객체로 변환하여 반환
		
		double isum = sum(iList);
		//double 타입의 isum은 iList의 합계
		double dsum = sum(dList);
		//double 타입의 dsum은 dList의 합계
		
		//sum(sList); // 오류 발생
		System.out.println("inum의 합계  : " + isum);
		System.out.println("dnum의 합계 : " +dsum);

	}
	
	public static double sum(List<? extends Number> list) {//상한이 있는 와일드 카드
		//상위 제한 설정하여 수퍼클래스 또는 수퍼클래스를 상속받은 하위 객체만 타입으로 지정 가능하다.
		//<?super 하위클래스/인터페이스> 하위제한 설정 extends와 반대개념이다, 하한이 있는 와일드 카드
		//<-> 반대로 <?super 서브클래스>는 하위 제한을 설정한 것.
		//와일드카드에 하위 제한을 두면 서브클래스 또는 서브클래스가 상속하고 있는 상위 객체만 타입으로 지정 가능
		double total = 0;
		//double 타입의 total을 0으로 초기화
		for(Number v : list) {
			total += v.doubleValue();
		}//Number타입의 v가 list인 경우 total은 doubleValue의 합과 같다.
		return total;//total 값 반환 
		
	}
}

//[상위제한]
//<? extends 슈퍼클래스>
//슈퍼클래스 또는 슈퍼클래스를 상속받은 하위 객체만 타입으로 지정할 수 있다.
//<? super 서브클래스>
//서브클래스 또는 서브클래스가 상속하고 있는 상위 객체만 타입으로 지정할 수 있다.
