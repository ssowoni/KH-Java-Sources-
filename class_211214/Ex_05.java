//배열의 요소의 개수와 크기
package class_211214;

public class Ex_05 {

	public static void main(String[] args) {
		
		int aa[] = { 10, 20, 30, 40, 50};
		int count, size;
		
		count = aa.length;
		size = count * Integer.BYTES;
		//int의 bytes는 4byte
		//int 변수의 용량이 4byte에 5를 곱한 20
		System.out.printf("배열 aa[]의 요소 개수는 %d 입니다. \n", count);
		//각각 배열을 요소라고 나타낸다.
		System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 입니다. \n", size);

	}

}
