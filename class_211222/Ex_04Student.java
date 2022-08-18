package class_211222;
//학생은 사람의 일부이므로 이름을 이렇게 지었다
//클래스를 선언할 때 이름을 막 짓는 것이 아니라 의미가 있도록 지어야 한다.
//Ex_04Student가 Ex_04Person클래스를 상속 받는다는 선언 

public class Ex_04Student extends Ex_04Person {
	//set 메소드를 활용해 데이터를 입력함
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		//weight 변수가 private이므로 상속 받는 것이 불가능함
		//set을 통한 간접 상속
		setWeight(99);
	}
	public void showPoint() {
		System.out.println("이름 : " + name + " 나이: " + age + " 키: " + height + " 몸무게: " + getWeight());
	}
	
}
