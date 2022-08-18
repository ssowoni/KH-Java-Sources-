package class_211222;

//부모클래스
public class Ex_03Point {

	
	private int x,y;
	//set메소드로 좌표 정보 받아들인다.
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//입력받은 데이터 출력
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
