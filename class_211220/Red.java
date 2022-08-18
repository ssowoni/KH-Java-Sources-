package class_211220;

public class Red {

	String color;
	
	public String getVehicle() {
		return color;
	}
	
	public void setVehicle(String color ) {
		this.color = color;
	}
	
	
	public static void main(String[] args) {
		
		Red car = new Red();
		car.setVehicle("RED");
		System.out.println(car.getVehicle());
		

	}

}
