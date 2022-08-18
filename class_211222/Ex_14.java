package class_211222;

public class Ex_14 {

	public static void main(String[] args) {
		
		Ex_14BadBank b1 = new Ex_14BadBank();
		Ex_14NormalBank b2 = new Ex_14NormalBank();
		Ex_14GoodBank b3 = new Ex_14GoodBank();
		
		System.out.println("BadBank의 이자율 : " +b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " +b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " +b3.getInterestRate());
		
		

	}

}
