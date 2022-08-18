package class_211224;

public class Ex_11_15 {

	public static void main(String[] args) {
		//아래와 같이 서로 다른 자료형을 사용해도 되고
		OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("mykey", 12345678);
		//자료형이 같아도 상관 없다 
		OrderedPair<String, String> p2 = new OrderedPair<String, String>("Java", "a programming language");
		System.out.println(p1.getKey()+ " "+ p1.getValue());
		System.out.println(p2.getKey()+ " "+ p2.getValue());
		
		String a = "3"+34;
		System.out.println(a);

	}
}
