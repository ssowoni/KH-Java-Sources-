package class_211224;


class Point4{
	//필드 멤버 변수
	int x,y;
	public Point4(int x, int y) {
		this.x =x;
		this.y=y;
	}
}

public class Ex_02_09 {

	public static void main(String[] args) {
		//new로 객체 생성! 
		//a, b, c 모두 저장되는 값은 같지만 객체의 저장 위치가 다르므로
		//c=a로 대입 연산 받은 a, c만 완전히 같은 값을 가진다
		
		
		Point4 a = new Point4(2,3);
		Point4 b = new Point4(2,3);
		Point4 c = a;
		
		
		//a와 b의 값이 같으면 아래 문장 출력
		//a==b의 경우 두 변수에 저장된 값의 값 뿐 아니라 저장된 주소의 위치도 같아야 한다. 
		//문자열에선 ==보단 equals를 주로 사용한다 ! 

		if(a == b)
			System.out.println("a == b");
		if(a == c)
			System.out.println("a == c");
		if(b == c)
			System.out.println("a == c");
		

	}

}
