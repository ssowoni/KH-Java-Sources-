package class_211231;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex_03_09 {

	public static void main(String[] args) throws Exception {
		//FileReader: 파일에서 바이트를 읽어들여 문자스트림으로 변환
		//FileReader로 c:/Windows/win/ini 파일 열기
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		//BufferedReader: 문자 버퍼 입력, 라인 해석
		//행단위로 읽기 위해 BufferReader 클래스 활용
		BufferedReader bReader = new BufferedReader(fReader);
		String str = null;
		while ((str = bReader.readLine())!=null) {
			//BufferedReader에서 파일의 한 행씩 읽기
			System.out.println(str);
		}
		bReader.close();
		fReader.close();

	}

}
