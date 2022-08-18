package class_211231;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex_01_07 {

	public static void main(String[] args) {
		//초기값은 안줘도 되지만 주는게 깔끔하다. 
		InputStreamReader in =null;
		FileInputStream fin = null;
		try {
			//FileInputStream : 파일에서 바이트를 읽어들여 바이트 스트림으로 변환
			fin = new FileInputStream("C://aaa//data1.txt");
			//인코딩을 UTF-8로 한다.
			//InputStreamReader : 바이트 스트림을 문자 스트림으로 변환한다.
			in = new InputStreamReader(fin, "UTF-8");
			int c;
			//getEncoding : 인코딩 형태를 읽어들임
			System.out.println("인코딩 문자 집합은 " +in.getEncoding());			
			//↓파일에서 문자 하나를 read()로 읽어온다.
			//즉 메모장에 저장되어 있는 글을 읽어오는 것! 
			//문자가 끝일 경우 -1를 반환한다.
			while((c=in.read())!= -1) {
				//↓char로 변수형 변경
				//출력값이 시작점이니까 여기서 하나씩 읽으며 올라간다.
				//바이트 형식으로 리턴했기에 char로 강제 형변환.
				System.out.print((char)c);
			}
		//파일의 모든 내용을 처리한 후 닫는다. 
		in.close();
		fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
