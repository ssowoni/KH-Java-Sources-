//call by string
package class_211217;

public class Ex_03 {
	//public String setAddress(String addr) {
	public void setAddress(String addr) {
		//매개변수를 받아들인 후 내부 문자열 변수 값 받아들인다.
		//하지만 지역변수 이기 때문에 소멸된다. 
		//즉 메인 메소드가 아닌 멤버 함수에서 정의된 변수는 
		//메인 메소드에서는 어떤 값이 저장되어있는지 알 수 가 없는 것 
		//리턴값을 반환하지 않는 이상 값의 변동은 없다. 
		addr = "경기도 성남시 중원구";
		//System.out.println("메소드 호출 후" + addr);
		//return addr;
		//return addr;
	}
	
	
	
	public static void main(String[] args) {
		String address = "서울시 강남구 논현동";
		Ex_03 st = new Ex_03();
				
			System.out.println("메소드 호출 전");
			//메소드 호출 전 저장된 변수 출력
			System.out.println("adress = "+address);
			
			//메소드 실행
			//address = "경기도 성남시 중원구";
			st.setAddress(address);
			
			System.out.println("메소드 호출 후");
			//메소드 실행 후 변수 출력, 결과값 변화 없다. 
			System.out.println("adress = "+address);
			
	}

}
