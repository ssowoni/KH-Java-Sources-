package class_211220;

public class Ex_14 {
	int radius;
	String name;
	//필드와 매개변수명이 똑같을 경우에는 필드 앞에 this를 붙여서 인스턴스 즉) 객체안에 있는 필드를 표현해줘야한다. !
	//반지름 데이터를 받아들이는 메소드 setter 메소드 형태
	//this는 가르키는 것
	void set(int r) {
		this.radius = r;
	}
	//donut 객체의 경우 반지름 정보가 없으므로 연산이 제대로 이뤄지지 않는다.
	double getArea() {
		return 3.14 * radius * radius;
		
	}
	//내부 내용이 없기 때문에 기본 생성자
	//dobut 객체를 Ex_14()메소드에서 받는다.
	public Ex_14() {
		//radius = 0;
	}
	
	//pizza 객체를 Ex_14(int r, String n) 메소드에서 받는다. 
	public Ex_14(int r, String n) {
		this.radius = r;
		this.name = n;
	}
	

	public static void main(String[] args) {
		Ex_14 pizza = new Ex_14(10, "모래");
		System.out.println(pizza.getArea() + "\n" + pizza.name);
		Ex_14 donut = new Ex_14();
		//이것 수행하면 작동하지 않음, 반지름 정보가 주어지지 않기 때문에
		System.out.println(donut.getArea());

	}

}
