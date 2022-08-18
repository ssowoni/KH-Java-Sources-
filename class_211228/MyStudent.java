package class_211228;

public class MyStudent<T> {

	private T student;
//	public void set() {
//		
//	}
	//제너릭이 아닌 일반 클래스에서 생성자 생성할 때!
	//객체 생성시 전달받은 값을 객체로 초기화하기 위해서 생성자를 사용한다. 
	//public Ex_01Constructor(int radius) {
	//this.radius = radius;
	//}

	MyStudent(T student){
		this.student = student;
	}
	public T getName() {
		return student;
	}
}
