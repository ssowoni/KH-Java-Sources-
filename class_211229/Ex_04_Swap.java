//제네릭 메소드 
//혼자 작성해보자
//211228 Ex_01번 예제랑 비교해보기 
package class_211229;

class Ex_04_MyArraylg_Swap{
	//a가 포인트!! 중요하다 
	//language가 a인 것! 
	//이게 바로 제네릭 메소드! 
	//접근제한자 < 제네릭 파라미터> 반환형(void) 생성자명(매개변수)
	public static <T> void swap(T[] a, int i, int j) {
		//swap =  1번과 2번 데이터를 교환함 
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		
		
		}
	}


public class Ex_04_Swap{

	public static void main(String[] args) {
		String[] language = {"C++", "C#", "JAVA"};
		//메소드 이름 앞에 <제네릭 파라미터>가 있으면 제네릭 메소드
		//리턴타입 변수명 = 클래스.<구체적 타입> 메소드명(인자)
		//하지만 타입이 예측 가능할때는 생략하곤 한다. 이 형식을 알아두면 알아볼 수 있을 것이다.
		Ex_04_MyArraylg_Swap.swap(language, 1, 2);
		//System.out.println(language);//오버라이딩 필요!! 
		for(String value : language)
			System.out.println(value);
		
		

	}

}
