//RUN - > Run configurations -> Arguments 들어갈 값 넣기 
package class_211216;

public class Ex_11 {

	public static void main(String[] args) {
		
		double sum = 0.0;
		
		for(int i =0; i < args.length; i++) //인자 개수만큼 반복
			sum += Double.parseDouble(args[i]);
		//문자열을 실수(double 타입_로 변환하여 합산 
		
		System.out.println("합계 : " + sum );
		// 두개 이상 넣어보기

	}

}
