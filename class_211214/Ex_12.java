package class_211214;

public class Ex_12 {

	public static void main(String[] args) {
		
		String[] str = new String[] {"산토끼", "집토끼", "판토끼", "죽은토끼", "알카리토끼"};
		
		for( int k = 0; k < str.length; k++) { //일반 for문
			System.out.println("k= " +str[k]);
		}
		System.out.println("===========================");
		
		for(String c: str) // 확장 for문,  일반for문과 값은 동일하게 나온다는 걸 확인
			System.out.println("k= " + c);

	}

}
