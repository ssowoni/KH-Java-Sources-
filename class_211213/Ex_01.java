//문자열 뒤바꾸기
package class_211213;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		String str; //입력받는 문자열
		int index; //지수
		char ch;// 마지막 문자
		String rest;// 남은 문자열
		String outputStr = ""; //출력문자열
		Scanner sc = new Scanner(System.in);
		
		System.out.println("길이가 3인 문자열을 입력하세요: ");
		str = sc.next();//문자열을 입력받는다 만약에 (박소원)을 입력
		System.out.println("입력문자열 : " +str);//입력한 문자열을 출력한다.
		
		index = str.length() -1;
		//str의 문자열 길이에서 1을 빼면 마지막 글자 인덱스 번호
		ch = str.charAt(index); //str의 마지막 문자를 끄집어 낸다 (원)을 끄집어낸다
		rest = str.substring(0, index); // 마지막 문자를 제외하고 남은 문자열을 rest에 저장 (박소)만 저장
		outputStr +=ch; //(원) 
		//str에서 끄집어 낸 문자를 출력 문자열의 끝에 추가(" " + 끄집어낸 문자)
		
		index = rest.length() -1;
		//rest의 문자열 길이에서 1을 빼면 마지막 인덱스 번호
		ch = rest.charAt(index); //rest의 마지막 문자를 끄집어 낸다 rest의 마지막 문자는 (박소) 중에 (소)
		rest = rest.substring(0, index);
		//마지막 문자를 제외하고 남은 문자열을 rest에 저장 (박) 저장
		outputStr += ch; //rest에서 끄집어 낸 문자를 출력열의 끝에 추가
		//현재 outputStr에 (원)이라는 문자가 저장되어 있는데 여기에 ch 값인 (소)를 추가한다.
		outputStr += rest; //rest를 출력 문자열의 끝에 추가 
		//outputStr에 (원소)저정돼있는데 여기에 rest의 값인 (박)을 저장한다
		
		System.out.println("출력 문자열 : " + outputStr);//출력 문자열을 출력한다
		//따라서 출력값은 문자열이 아예 뒤바뀐 (원소박) 출력
		
		
		sc.close();
		

	}

}
