//배열에서 에러난 이유 찾아보기
package class_211214;

public class Ex_01_211414 {

	public static void main(String[] args) {
		int[] a= new int [5]; //배열에 값을 지정해줬다. 
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] = 234;
		// a[5] = 3244;
		//배열의 크기는 5까지인데 index값을 6개 적어줬기에 오류가 난다. 
		System.out.println("배열의 갯수 : " + a.length); 
		for( int i=0; i<a.length; i++) {
			//i가 배열의 크기만큼 증가해서 반복한다. 
			System.out.println("a[" + i + "] = " +a[i]);
			//a[i]의 값을 출력한다. 
		}

	}

}
