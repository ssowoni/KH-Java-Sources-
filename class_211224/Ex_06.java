package class_211224;

import java.util.StringTokenizer;

public class Ex_06 {

	public static void main(String[] args) {
		
		
		//StringTokenizer(String str, String delim)
		//str 스트링 delimator(구분자) 구분 문자로 문자열을 분리하는 스트링 토크나이저 생성
		String query = "name =kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query,"&");
		//↑ 선생님이 보여주신 답 이렇게 하면 앞에 05예제처럼 while 문으로 받아야한다.
		
		//StringTokenizer query = new StringTokenizer("kitae&seoul&21","&");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//String nextToken() 스트링 토크나이저가 들어있으면 다음 토큰 리턴한다. 
//			System.out.println("name=" + query.nextToken());
//			System.out.println("addr=" + query.nextToken());
//			System.out.println("age=" + query.nextToken());
			
//			
//			String cc[] = new String[] {"name=", "addr= " , "age= "};
//			for(int i = 0; i <cc.length; i++) {
//				System.out.println(cc[i] + query.nextToken());
//				
////			}
			
			
			
			
	}
	}



