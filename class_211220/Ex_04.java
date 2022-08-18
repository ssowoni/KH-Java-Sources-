package class_211220;

public class Ex_04 {

	public static void main(String[] args) {
		
		//myCar 객체 생성
		Ex_04car myCar = new Ex_04car();
		
		//changeGear 메소드 실행
		myCar.chageGear(1);
		
		//speedUp 메소드 실행
		myCar.speedUp();
		
		System.out.println(myCar.toString());

	}

}
