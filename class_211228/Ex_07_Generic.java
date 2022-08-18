//안보고 혼자 작성해보기
package class_211228;
public class Ex_07_Generic<T> {
	T[] data;
	public void setType(T[] _data) {
		data = _data;
	}
	public void print() {
		for(int i =0; i< data.length; i++) {
			System.out.println(data[i]);
		}
	}	
	
	public static void main(String[] args) {
		//↓CharSequence : String과 다르게 인터페이스로 char 값을 읽을 수 있다.
		Ex_07_Generic<CharSequence> gt = new Ex_07_Generic<>(); //문자 배열
		String[] str = {"야호", "신난다", "화요일 이니까"};
		gt.setType(str);
		gt.print();
		
		//Integer 랩퍼 클래스로 인자 타입을 설정했다
		//제너릭 매개변수로써 활용되기 위해서는 변수 타입을 랩퍼 클래스로 정의해야 한다.
		Ex_07_Generic<Integer> gt2 = new Ex_07_Generic<>();//숫자형
		Integer[] it = {3, 24, 67, 234};
		gt2.setType(it);
		gt2.print();

	}

}
