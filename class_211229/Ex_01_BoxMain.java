package class_211229;


class Orange{
		int sugarContent;
		//생성자 Orange는 int형의 sugarCotent를 받아들인다.
		//즉 FruitBox의 pullout의 값을 받아들인다.
		public Orange(int sugarContent) {
			this.sugarContent = sugarContent;
		}
		public void showSugarContent() {
			System.out.println("당도 : " +sugarContent);
		}
	}
	
class Apple{
		int weight;
		//생성자 Apple은 int형의 weight를 받아들인다.
		//즉 FruitBox의 pullout의 값을 받아들인다.
		public Apple(int weight) {
			this.weight = weight;
		}
		public void showAppleWeight() {
			System.out.println("무게 : " + weight);
	}
	}
//제네릭 변수를 받아드리는 FruitBox기에 클래스명 뒤에 <T> 적는다.
class FruitBox<T>{
	T item;
	
	public FruitBox(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
	
}
	
public class Ex_01_BoxMain {

	public static void main(String[] args) {
		//FruitBox 객체 변수 orBox는 Orange 제네릭 변수로 받아들임 
		//Orange 클래스 객체에 10이 입력되고 저장된다. 
		FruitBox<Orange> orBox = new FruitBox<Orange>(new Orange(10));
		//저장된 데이터는 FruitBox에서 사용된 Orange 객체와 동일해 pullOut 메소드에 의해 10 값이 출력됨
		Orange org = orBox.pullOut();
		//획득한 값을 showSugarCountent 메소드를 활용해 출력
		org.showSugarContent();
		
		//사과도 오렌지와 마찬가지로 활용 가능, 제네릭을 활용했기 때문에 하나의 클래스로 두 가지 동작 수행
		FruitBox<Apple> apBox = new FruitBox<Apple>(new Apple(20));
		Apple app = apBox.pullOut();
		app.showAppleWeight();
		
	}

}
