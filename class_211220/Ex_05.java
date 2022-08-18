//Ex_02 예제와 비슷하다. 
package class_211220;

public class Ex_05 {

	public static void main(String[] args) {
		
		//객체 생성
		Ex_05Math obj = new Ex_05Math();
		
		//위 아래의 메소드명은 모두 square로 동일하지만
		//들어가는 인수(argument, 매개변수와 유사)의 데이터 타입이 정수와 부동소수로 서로 다르다.
		//Ex_05Math 클래스에서 동명의 메소드가 존재하는 오버로딩이 있음을 예상할 수 있다. 
		
		//sum = obj.add(2, 3);
		//System.out.println("2와 3의 합은" + sum);
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));

	}

}
