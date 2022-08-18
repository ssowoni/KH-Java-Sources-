//RUN - > Run configurations -> Arguments 들어갈 값 넣기 
package class_211216;

public class Ex_06_02 {

	public static void main(String[] args) {
		
		//arg를 입력받을 메인 메소드를 준비한다.
		if(args.length > 0) {
			for ( int i = 0; i < args.length; i++)
				System.out.print(" " + args[i]);
			if(args[0].equals("-h"))
				//문자열에 -h가 있으면 아래 문장 실행한다. 
				System.out.println("HELP");
			
		}

	}

}
