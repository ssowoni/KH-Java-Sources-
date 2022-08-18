//이것도 혼자 생각해보는 것 
//Ex_03television을 먼저 보여준 다음에 메인 메소드 작성하는 문제
package class_211220;
public class Ex_03 {

	public static void main(String[] args) {
		
		//Ex_03television 클래스의 tv 객체 생성.
		int result;
		Ex_03television tv = new Ex_03television();
		//tv.channel = 11;
		
		
		//int cha = tv.setChannel(11);
		
		//int cha =11; 
		//tv.setChannel(cha);
		
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + area);
		
//		int channel = tv.getChannel(11);
//		System.out.println("현재채널은 " + channel +"입니다");
		
		//Ex_03television 클래스의 steChannel값에 11을 대입한다. 
	tv.setChannel(11);
//		//현재 채널은 getChannel()의 값을 받는다. 
	System.out.println("현재채널은 " + tv.getChannel() +"입니다");
		
		
		tv.channel = 11;
		result = tv.getChannel();
		System.out.println("현재채널은 " + result +"입니다");
		

//		tv.channel = 11;
//		System.out.println("현재 채널은" + tv.channel + "입니다.");
		
		
		
		

	}

}
