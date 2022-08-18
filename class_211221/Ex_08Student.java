package class_211221;

public class Ex_08Student {
	
	//↓name은 default 값이므로 같은 패키지 내에 있으면 가져다 쓸 수 있다. 
	String name;
	//↓grade는 private 제한자로 제한되기 때문에 getter가 있어야 된다.! 
	private int grade;
	
	
	//★인자가 2개이므로 생성자에서 매개변수도 2개로 입력한다. 
	public Ex_08Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}

}
