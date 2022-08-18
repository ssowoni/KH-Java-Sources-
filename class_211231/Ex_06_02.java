package class_211231;

import java.io.File;
import java.io.IOException;

public class Ex_06_02 {

	public static void main(String[] args)throws IOException {
		
		//#0. C 드라이브내에 temp 폴더 생성(없는 경우에)
		File tempDir = new File("C:\temp");
		if(!tempDir.exists())
			tempDir.mkdir();
		
		//#1. 파일 객체 생성
		//기초자료형으로 치면 int, Stirng과 같은 File이 대행자 내세운 참조변수 file
		File file = new File("C:/Windows");
		
		//#2. 파일 메서드
		System.out.println("절대경로: " + file.getAbsolutePath());
		System.out.println("폴더(?)" + file.isDirectory());
		System.out.println("파일(?)" + file.isFile());
		System.out.println("파일/폴더 이름: " + file.getName()); //파일 또는 폴더 이름
		System.out.println("부모 폴더: " +file.getParent());
		
		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir());//true : (이미 폴더가 있는 경우 fale)
		File newfile2 = new File("C:/temp/bcd/cde");
		//↓mkdir() 함수는 생성하려는 폴더의 위치에 가기 전까지 폴더가 존재해야지만 새로 만들려고 하는 폴더를 생성할 수 있다.
		System.out.println(newfile2.mkdir()); // false
		//↓C드라이브에 temp라는 폴더가 없는 경우 temp 폴더를 생성하고 그 안에 log폴더를 생성합니다.
		//지정한 경로에 폴더가 없는 경우 폴더를 생성하여 마지막 지정한 폴더까지 생성해 줍니다.
		System.out.println(newfile2.mkdirs());//true: (이미 폴더가 있는 경우 false)
		
		File[] fnames = file.listFiles();
		//fname은 File의 타입
		for(File fname : fnames) {
			System.out.println((fname.isDirectory()? "폴더:" : "파일:")+fname.getName());
		}

	}

}
