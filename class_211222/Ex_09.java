//다형성
package class_211222;
//아래 상속 관계를 보자면
//Person  -> Strudent
//Person - > Strudent -> Professor이 된다.

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class Ex_09 {
	//해당 메소드의 인수와 매개변수 (paraneter)를 합쳐서 보면 다음과 같다.
	//Person p = new Student();
	//자식 객체가 부모 멤버(필드 + 메소드)를 활용하는 형태
	//이러한 형태를 업 캐스팅이라고 한다. 자동 ex) 사람은 학생이 될 수도 있고 직장인이 될 수도 있다.
	//반대의 경우 다운 캐스팅이 된다. 수동 ex) 학생은 사람이다
	static void print (Person p) {
		//instanceof 는 레퍼런스의 타입을 식별하는데 사용한다.
		//a instanceof b 메소드
		//a, b는 모두 객체이고 a 객체가 b 객체의 자식 클래스일 경우 true
		//아닐 경우에는 false를 출력한다.
		//instanceof 연산자는 주로 다운케스팅 할 때 현재 레퍼런스가 어떤 클래스형의 객체 주소를
		//참조하고 있는지 확인이 필요할 때 사용한다. 
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
			
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() -> \t");
		//print 메소드는 Ex_09 클래스의 자체 생성 메소드 이다.
		//전달하는 인수(argument)가 new Student()로 객체의 형태로 전달된다. 
		print(new Student());
		
		System.out.print("new Researcher() -> \t");
		print(new Researcher());
		
		System.out.print("new Profossor() -> \t");
		print(new Professor());
		
	}

}
