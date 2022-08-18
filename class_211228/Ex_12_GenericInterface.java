package class_211228;
//제너릭 인터페이스는 제너릭 클래스처럼 타입 매개변수를 사용하는 것이다.
//인터페이스는 일종의 추상클래스
//선언하는 방법은 제너릭 클래스와 동일하다.
interface Maximum <T extends Comparable<T>>{
	T max();
}
//제너릭 인터페이스 선언. Comparable을 상속받는 타입만 전달받을 수 있다
class NumUtil<T extends Comparable<T>> implements Maximum<T>{
	T[] value;
	//NumUtil은 Comparable을 상속 받는 타입만 전달받을 수 있고, Maximum을 구현한다
	//배열 값을 저장한다. 
	NumUtil(T[] value){
		this.value = value;
	}
	//제너릭 생성자 선언. 매개변수로 전달받는 배열을 value 필드에서 참조
	public T max() {//max() 메소드를 타입 매개변수로 저장한다.
		//변수 v에 value 배열의 첫 번째 값을 저장한다.
		//0번째 값으로 초기화 시킨 것. 
		T v = value[0];
		
		for(int i = 0; i<value.length; i++) {
			if(value[i].compareTo(v) > 0)
					v= value[i];
		//value[i]의 값이 더 크면 v 변수값에 저장.
		//배열의 마지막 요소까지 작업이 완료되면
		//변수 v에는 가장 큰 값이 저장된다.
			
		}
		return v;
	}
		
}
public class Ex_12_GenericInterface {
	public static void main(String[] args) {
		//Integer 타입의 배열을 inum에 저장
		Integer[] inum = {1, 2, 3, 4, 5};
		//Double 타입의 배열을 dnum에 저장
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		//String 타입의 배열을 snum에 저장
		String[] snum = {"1", "2", "3", "4","5"};
		
		//↓NumUtil<Integer> iutil은 제너릭 타입으로 <Integer>inum 을 포함하는
		//NumUtil 객체를 참조하는 변수 
		NumUtil<Integer> iutil = new NumUtil<Integer>(inum);
		
		//↓NumUtil<Integer> iutil은 제너릭 타입으로 <Integer> dnum 을 포함하는
		//NumUtil 객체를 참조하는 변수 
		NumUtil<Double> dutil = new NumUtil<Double>(dnum);
		
		//↓NumUtil<String> sutil은 제너릭 타입으로 <String>snum 을 포함하는
		//NumUtil 객체를 참조하는 변수 
		NumUtil<String> sutil = new NumUtil<String>(snum);
		
		//각 타입 매개변수를 Integer, Double, String으로 지정하는 제너릭 클래스의 인스턴스를 생성한다.
		System.out.println("inum의 최댓값: " + iutil.max());
		System.out.println("dnum의 최댓값: " + dutil.max());
		System.out.println("snum의 최댓값: " + sutil.max());
		
		
	}

}
//제너릭 인터페이스를 선언했습니다.
//타입 매개변수는 extends Comparable로 선언했으므로 Comparable을 상속받는 타입만 전달받을 수 있다. 

//Comparable<T>는 java.lang에 제네릭 인터페이스로서 compareTo( T o) 메소드가 선언되었습니다.
//compareTo() 메소드는 현재 객체와 매개변수로 전달받은 객체의 순서를 비교하여 작으면 음수,
//같으면 0, 크면 양수를 반환합니다. 
