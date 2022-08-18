//중요한 내용!
//heap, stack 문법이 있고 이렇게 흐름을 타는 문법이있다.
package class_211231;

import java.io.File;
import java.io.IOException;

public class Ex_05_01 {

	public static void main(String[] args) throws IOException{
		//파일클래스의 객체 tempDir를 생성하는데 경로는 C드라이브의 temp폴더
		File tempDir = new File("C://temp");
		//만약에 tempDir에 폴더가 없다면 temp 폴더를 생성한다. 
		if(!tempDir.exists())
			tempDir.mkdir();

		//#1-1 . 파일 객체 생성
		File newFile = new File("C:/temp/newFile.txt");
		
		//#1-2. 파일이 없는 경우 실제 파일 생성
		if(!newFile.exists())
			newFile.createNewFile(); // temp 폴더가 없는 경우 예외 발생
		
		//#2. 파일 구분자
		File newFile2 = new File("C:\\temp\\newFile.txt"); //windows
		File newFile3 = new File("C:" + File.separator + "temp" + File.separator+ "newFile.txt"); //둘다 가능
		File newFile4 = new File("C:/temp/newFile.txt");//Mac
		
		//경로에 파일이 존재하는지 boolean형으로 출력.
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());
		
	}

}
