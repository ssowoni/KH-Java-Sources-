package class_211222;

public class Ex_08Point {
	private int x, y;
	public Ex_08Point() {
		this.x = 0;
		this.y = 0;
	}
	//이 부분으로 이동 (4)
	public Ex_08Point(int x, int y) {
	//this 키워드를 활용해 동명의 매개변수를 필드에 저장(5)
		this.x = x;
		this.y = y;
	}
	//이곳에서 (5) 동장 때 저장된 필드 정보를 출력
	public void showPoint() {
		System.out.println("(" + x + "," + y +")");
	}

}
