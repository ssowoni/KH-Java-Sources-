package class_211222;

public class Ex_13Empolyee {

	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	//해당 생성자에서 나머지 값들을 입력받고 완료 (4)
	public Ex_13Empolyee(String name, String address , int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}
	@Override
	//toString() : 최상위 클래스인 Object 클래스에 내장된 메소드
	//객체를 sysout()에 입력만 해도 별 동작 없이 자동으로 콘솔창에 출력된다. 
	public String toString() {
		return " Employee [ name = " + name + ", adrress= " + address + ", salary= " + salary + ", rrn= " +rrn+ "]";
	}
}
