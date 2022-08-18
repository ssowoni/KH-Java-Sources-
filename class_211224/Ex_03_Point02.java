package class_211224;

class Ex_03_Point02 {
	int x, y;
	public Ex_03_Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object o) {
		//equals는 주소가 아닌 값을 비교하는 것.
		//Object는 최상위 클래스 
		//Point가 나옴으로 이거 자체가 다운캐스팅 
		//다운캐스팅이란 자신의 고유한 특성을 잃은 객체를 다시 복구시켜 주는 것!  
		Ex_03_Point02 p1 = (Ex_03_Point02) o;
	
		if(x == p1.x && y ==p1.y)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Ex_03_Point02 a = new Ex_03_Point02(2,3);
		Ex_03_Point02 b = new Ex_03_Point02(2,3);
		Ex_03_Point02 c = new Ex_03_Point02(3,4);
		
		if (a==b) //false
			System.out.println("a == b");
		if(a.equals(b))//true
			System.out.println("a is equlas to b");
		if(a.equals(c))//false
			System.out.println("a is equals to c");

	}

}
