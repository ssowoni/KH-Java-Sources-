//오타 주의하자!!! 하나씩 빼먹어서 시간 낭비한다.
package class_211223;
public  class Ex_01 extends Ex_01Calculator{

	
		//@Override : 오버라이딩 되는 메소드임을 표시하는 어노테이션
		@Override
		//여기 추상 메소드들이 상세하게 표현된다.
		
		public int add(int a, int b) {
			return a + b;
		}
		public int substract(int a, int b) {
			return a - b;
		}
		public double average(int[] a) {
			double sum = 0;
			for(int i = 0; i <a.length;i++)
				sum+= a[i];
				return sum/a.length;
		}

		
		public static void main(String[] args) {
			//추상클래스의 객체를 생성할 수 없으므로 메인 클래스에 객체를 생성했다. (업캐스팅)
			////★업 캐스팅의 기본형 부모클래스 객체명 = new 자식생성자();
			//업캐스팅은 상속관계에 있는 부모, 자식 클래스 간에 부모타입의 레퍼런스가 모든 후손 타입의 객체의 주소를 받을 수 있다.
			Ex_01Calculator c = new Ex_01();
			//추상 메소드 연산 결과가 표시됨
			System.out.println(c.add(2,3));
			System.out.println(c.substract(2, 3));
			System.out.println(c.average(new int [] { 2, 3, 4}));
	}
	
}



