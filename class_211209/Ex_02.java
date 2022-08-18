package class_211209;

public class Ex_02 {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		//대입 연산자 사례
		
		a += 3;//x+=y -> x= x+y 즉) a= a+3 = 6
		b *= 3;//b=b*3= 9
		c %= 2;// c=c%2 =1
		System.out.println("a= " + a + ",b= " + b + ",c=" + c);
		int d=3;
		
		//증감연산자 사례
		//++x는 무조건 증가, x++는 증가는 하지만 원래 x값은 증가 전 값. 
		a = d++; // a = 3 ,d= 3을 대입 전위보단 후위를 훨씬 많이 쓴다.
		System.out.println("a= " + a + ",d= " +d);//a=3, d=4
		a= ++d; // a=4, d=4를 대입했을 때
		System.out.println("a= " + a + ",d= " +d);// a=5, d=5
		a = d--;// a=5, d=5
		System.out.println("a= " + a + ",d= " +d);//a=5, d=4
		a = --d;//a=4, d=4
		System.out.println("a= " + a + ",d= " +d);//a=3, d=3
		//이 이후에 d의 값은 3이 된다. 

	}

}
