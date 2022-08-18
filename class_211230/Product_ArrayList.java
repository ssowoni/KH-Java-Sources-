package class_211230;

public class Product_ArrayList<T> {

	private T t;
	private T t1;
	private T t2;
	private T t3;
//값 받을 때 t3의 값을 this.t3=t;라고 적었다.......
	public Product_ArrayList(T t, T t1, T t2, T t3) {
		this.t=t;
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
	}
	
	public T getCode() {
		return t;
	}
	public T getName() {
		return t1;
	}
	public T getColor() {
		return t2;
	}
	public T getQty() {
		return t3;
	}
	

}
