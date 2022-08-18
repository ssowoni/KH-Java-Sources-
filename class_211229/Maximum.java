package class_211229;

interface Maximum <T extends Comparable<T>>{
	//제네릭 인터페이스 선언, Comparable 상속받는 타입만 전달 받음
		//이 코드만 보면 max라는 메소드를 가지고 뭔가 하겠구나
		//근데 T타입이라 무슨 타입인지 모르네? 이렇게 생각하고 넘어가야한다. 
		//T는 comparable<T>의 상속을 받는다
		//
	T max();
}
