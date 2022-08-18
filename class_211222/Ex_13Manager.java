package class_211222;

public class Ex_13Manager extends Ex_13Empolyee{
	private int bonus;
	//이동한 뒤 bonus만 this 키워드로 전달하고(2)
	public Ex_13Manager(String name, String address , int salary, int rrn , int bonus) {
		//나머지 데이터는 Ex_13Empolyee 클래스로 전송된다.  (3)
		//super() 는 부모의 생성자를 호출하는 것.
		//부모 생성자가 먼저 실행 되어야 하기 때문에 명시적으로 작성한다.
		
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	void test() {
		//이 변수들은 Ex_13Manager필드에 존재하지 않지만
		//부모 클래스인 Ex_13Empolyee 클래스에 있으므로 바로 활용이 가능하다.
		System.out.println("name = " +name);
		System.out.println("address = " +address);
		System.out.println("salary = " +salary);
		//System.out.println("rrn = " +rrn);은 private라 안된다. 
	}
}
