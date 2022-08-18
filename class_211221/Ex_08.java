//private, 생성자, setter&getter
//여기서 getGrade() 메소드를 입력해 줘야 하는데  getGrade 라고만 입력해서 오류가 났다. 
package class_211221;

public class Ex_08 {

	public static void main(String[] args) {
		//생성자를 통해 학생 정보 입력
		Ex_08Student s1 = new Ex_08Student("홍길동", 3);
		
		//default 접근 제어자인 name은 동일 패키지 내부에서 사용이 가능하지만
		System.out.println("학생 이름은: " + s1.name);
		//private 접근 제어자인 grade는 getter 메소드를 통한 간접 참조만 가능하다.
		System.out.println("학생의 학년은: " + s1.getGrade());

	}
}
