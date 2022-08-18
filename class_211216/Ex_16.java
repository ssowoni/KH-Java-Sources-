//항상 기계모드로 생각하자. 인간모드가 아닌 
package class_211216;

public class Ex_16 {

	public int summarize(int a) {
		int sum = 0;
		//매개변수 a 까지 합을 구함 
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum; //마지막에 int형의 return 값으로 반환한다는 걸 생각하자. 
	}
	
	//화살표 8개 그을 수 있다. 정리해보자
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 100;
		int result = 0;
		
		//클래스 이름과 같은 객체 변수 m생성
		Ex_16 m = new Ex_16();
		
		//result 값에 summarize에서 반환한 값을 저장한다. 
		result = m.summarize(num1);
		System.out.println("1에서 10까지의 합은 : " + result);
		
		result = m.summarize(num2);
		System.out.println("1에서 20까지의 합은 : " + result);
		//System.out.println("1에서 100까지의 합은 :  " + m.summarize(100));
		
		result = m.summarize(num3);
		System.out.println("1에서 100까지의 합은 : " + result);
		

	}

}
