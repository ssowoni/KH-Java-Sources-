package class_211231;

import java.io.FileInputStream;

public class Ex_02_08 {

	public static void main(String[] args) throws Exception {
		//c://aaa//data1.txt : 해당 경로의 파일을 객체로 만듦
		
		FileInputStream fis = new FileInputStream("c://aaa//data1.txt");
	
		//저장되어있는 내용을 한글자씩 값으로 출력하기 위해서 변수 생성
		int ch;
		//int bufSize = fis.available();
		////읽어올 수 있는 byte의 수를 반환하고
		//byte[] buf = new byte[bufSize];
		////bufSize 만큼의 byte 배열을 선언한다.
		//위에처럼 적어도 되고 아래처럼 적어도 된다.
		
		byte[] bt = new byte[1024];
		//생성한 bt 참조변수를 배열로 나열해서 값을 저장하기 위해 생성
		int i = 0;
		//read 메소드를 활용하면 내부에 작성된 문자를 한 글자씩 읽어들인다
		while((ch = fis.read()) != -1) {
			bt[i] = (byte) ch;
			i++;
		}
		System.out.print(new String(bt));
		fis.close();
	}
}

	
	
	

