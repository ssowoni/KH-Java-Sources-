package class_211220;

public class Ex_06 {
	
	int radius;
	String name;
	//기본 생성자, 만들지 않아도 컴파일러가 알아서 생성된다.
	
	public void Ex_06Circle() {
		
	}
	
	//면적을 구하는 메소드, 리턴 타입이 double이다.
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		//Ex_06 pizza = new Ex_06(); 이렇게 쓰는 걸 두줄로 써보기
		//pizza 객체 생성
		Ex_06 pizza;
		pizza = new Ex_06();
		
		//객체에 해당 변수를 입력한다.
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		//면적은 아래 메소드를 활용해 구함
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		//객체생성
		//위의 동작을 반복한다, 클래스는 같지만 객체변수가 다르기 때문에 결과는 다르다
		
		//donut 객체 생성
		Ex_06 donut = new Ex_06();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " +area);

	}

}
