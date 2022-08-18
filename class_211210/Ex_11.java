package class_211210;

public class Ex_11 {

	public static void main(String[] args) {
		String str = "no nesw is good news";
		int i, result = 0;
		char c;
		
		for(i = 0; i < str.length(); i++) {
			c = str.charAt(i);//위에서 언급한 str문장을 가르킨다.
			if(c != 'n') {//문자가 n이 아니면 건너 뛰어서 다시 반복문 처음으로 돌아간다.
				continue;
			}else // 문자가 n이 나온다면 아래 문장 실행한다. 
				result++; // result = result + 1;
		}//result는 n이 나올 때만 ++ 하나씩 증가한다. 
		//여기서 no news news 총 n이 3번 나오므로 result 값은 3
		System.out.printf("개수 : %d\n", result);

	}

}
