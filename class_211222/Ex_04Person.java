package class_211222;

public class Ex_04Person {
	private int weight; // private이므로 하위 클래스가 상속 받지 못한다.
	int age;
	//protected는 동일 패키지 내와 상속 받는 클래스에서만 사용 가능하다
	protected int height;
	//public은 접근에 제한이 없다
	public String name;
	
	//getter와 steer 메소드의 전형적인 형식
	public void setWeight ( int weight) {
		//this는 해당 클래스를 의미한다
		//만약 this를 사용하지 않으면 두 변수의 이름이 같으므로
		//해당코드의 의미가 없어진다.
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}

}
