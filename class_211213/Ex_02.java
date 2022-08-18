package class_211213;

public class Ex_02 {
	
	public static final double PI = 3.14;
	public double radius;//radius를 바꿔야 한다. ! hint
	
	public void Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
	public void draw() {
		System.out.println("반지름" + radius+ "cm인 원을 그립니다");
	}
	
	//결과 반지름이 3.0cm인 원을 그립니다.

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


