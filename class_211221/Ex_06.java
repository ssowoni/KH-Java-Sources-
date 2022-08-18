//접근제어
package class_211221;
	class A{
		private int a; // 전용
		//int a;//원래 이게 주석인데 에러 잡기 위해 private int a에서 private 지웠다. 
		int b; //  디폴트
		public int c; // 공용
		
		//getter, stter를 통해 private 변수의 정보 은닉을 한다. 
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
	}

	public class Ex_06 {
	public static void main(String[] args) {
		A obj = new A(); //객체생성
		obj.setA(10);//다른 클래스에 있는 private 변수는 get, set 이용해서 접근할 수 있다. 
		
		//obj.a = 10;//전용 멤버는 다른 클래스에서는 접근 안됨
		// 원래 이건데 오류 잡기 위해서 getter , setter 이용한다. 
		obj.b = 20;//디폴트 멤버는 접근할 수 있음
		//디폴트 멤버는 다른 패키지에 있는 클래스에선 사용할 수 없다는 것 !! 
		obj.c = 30;//공용 멤버는 접근할 수 있음.
		

	}
	}

	
