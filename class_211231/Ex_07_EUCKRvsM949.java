//파일과 문자셋, 자바의 문자셋
//Charset은 알아둘 필요가있다 우리는 UTF-8
package class_211231;

import java.io.UnsupportedEncodingException;

public class Ex_07_EUCKRvsM949 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		
		//#EUC-KR vs. MS949
		byte[] b1 = "a".getBytes("EUC-KR"); //문자열 --> byte[]
		byte[] b2 = "a".getBytes("MS949");
		
		//문자열.getBytes(문자셋)
		//문자셋을 기준으로 문자열을 byte[]로 분해해라. 
		System.out.println(b1.length);//1
		System.out.println(b2.length);//1
		
		System.out.println(new String(b1, "EUC-KR"));
		System.out.println(new String(b2, "MS949"));
		System.out.println();
		
		//new String(byte[] , 문자셋)
		//문자셋을 기준으로 byte[]를 조합해라
		byte[] b3 = "가".getBytes("EUC-KR"); //문자열 --> byte[]
		byte[] b4 = "가".getBytes("MS949");
		
		System.out.println(b3.length);//2
		System.out.println(b4.length);//2
		
		System.out.println(new String(b3, "EUC-KR"));//문자열 --> byte[]
		System.out.println(new String(b4, "MS949"));
		System.out.println();
		
		byte[] b5 = "봵".getBytes("EUC-KR"); //문자열 --> byte[]
		byte[] b6 = "봵".getBytes("MS949");
		
		System.out.println(b5.length);//1
		System.out.println(b6.length);//2
		
		//↓초기의 한글 완성형 문자셋 한글 중 2,350자만 표기한다. 
		System.out.println(new String(b5, "EUC-KR"));//문자열 --> byte[]
		//↓windows에서 사용되는 한글 완성형 표기로 위에서 누락된 8,822자를 포함한 한글 기본 문자셋이다. 
		System.out.println(new String(b6, "MS949"));
		System.out.println();
		
		
		
 
	}

}
