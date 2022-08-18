//Ex_05 예제와 비슷하다
package class_211220;

public class Ex_02 {

	public static void main(String[] args) {
		
		int sum;
		//객체 obj 생성
		Ex_02Math obj = new Ex_02Math();
		//ex08Math 내부 메소드 add 활용
		sum = obj.add(2, 3);
		System.out.println("2와 3의 합은" + sum);
		//이번에는 2, 3을 입력
		sum = obj.add(7,8);
		System.out.println("7와 8의 합은" + sum);

	}

}
