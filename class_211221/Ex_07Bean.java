package class_211221;

public class Ex_07Bean {
	
	public int a; //공용
	private int b; //전용
	int c; //디폴트
	
	public void setNum(int b) {
		this.b = b;
		//i = b;
	}
	
	public int getNum() {
		return b;
	}


}
