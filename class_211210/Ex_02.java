package class_211210;

public class Ex_02 {

	public static void main(String[] args) {
		int i;
		for(i = 0; i < 3; i ++)
		{//괄호가 있기에 밑에 2문장이 3번 반복된다.
			System.out.println("안녕하세요");
			System.out.println("##또또 안녕하세요##");
		}
		System.out.printf("\n\n");
		
		for(i=0; i<3; i++)//중괄호 사용 유무에 따른 차이
			//괄호가 없기에 바로 아래 1개 문장만 3번 반복된다
			System.out.println("안녕하세요?\r");
		// \n은 유닉스 \r은 mac \r\n은 윈도우 시스템에 따라 다를 수 있다
		//모두 줄 바꿈을 의미하는 것이니 알아두자
		System.out.println("또또 안녕하세요##");
	
	}

}
