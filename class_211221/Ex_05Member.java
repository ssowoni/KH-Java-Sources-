package class_211221;

public class Ex_05Member {
	
	//private를 붙이면 다른 클래스에서 값을 가져갈 수 없다.
	String id;
	String password;
	String name;
	String address;
	String phoneNum;
	
	public void regMember() {
		System.out.println("회원 가입합니다.");
	}
	public void viewMember() {
		System.out.println("회원정보를 조회합니다.");
	}
	public void modMember() {
		System.out.println("회원정보를 수정합니다.");
	}
	public void delMember() {
		System.out.println("회원정보를 삭제합니다.");
	}
	

}
