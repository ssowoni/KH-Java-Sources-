//Ex_13번 참고
//이해해서 작성해보기 
package class_211220;

public class Ex_15 {
	String title;
	String author;
	//필드와 매개변수명이 똑같을 경우에는 필드 앞에 this를 붙여서 인스턴스 즉) 객체안에 있는 필드를 표현해줘야한다. !
	
	void show() {
		System.out.println(title + " " + author);
	}
	//첫번째 메소드라서 무조건 출력
	public Ex_15() {
		//this는 지금 현재 클래스의 메소드를 의미한다. (중요)
		//this 메소드는 호출 
		//여기서 다시 오버로딩이 되므로 Ex_15(String title, String author) 생성자를 호출하고
		//Ex_15()를 호출한 객체 emptyBook에 필드 변수 title, author에는 아무것도 저장되지 않았다.
		this("","");//첫줄
		//this("+","")
		//맨 아래에 emptyBook.show(); 이 코드를 작성하고  this("","")이걸 삭제하면 null, null값이 나오는데 왜그런지 생각해보자. 
		//this("+", "") 이걸 생략하면 입력한 값이 없기 때문에 null이 나오는 것 ~! "",""여기 큰따옴표 사이에 다른 글자를 입력해보면 알 수 있다.  
		System.out.println("생성자 호출됨");
	}
	public Ex_15(String title) {
		//this()는 같은 클래스에 다른 생성자를 호출할 때 사용한다. 
		this(title, "작자미상");
	}
	//춘향전, 작자미상이 저장되어
	//아래로 내려간다.? 아닌 것 같다.
	
	public Ex_15(String title, String author) {
		this.title = title;
		this.author = author;
		//원래 없는 코든데 차이점 보기 위해서 작성했다. 
		//System.out.println(title + " " + author);
		
	}//매개변수 명을 다르게하면 정상 작동함
	//변수명 중복 오류를 해결하기 위해 사용하는 느낌
	
	public static void main(String[] args) {
		Ex_15 littlePrince = new Ex_15("어린왕자", "생텍쥐페리");
		//춘향전의 작가가 없으므로, Ex_15(String title) 생성자로 데이터를 저장
		//저장 방식은 this를 활용한다.
		Ex_15 loveStory = new Ex_15("춘향전");
		//Ex_15()생성자를 호출하므로 그 결과가 출력된다 -> 생성자 호출됨
		Ex_15 emptyBook = new Ex_15();
		//춘향전 객체에 저장된 정보를 출력함, author은 인수로 받지 않고 자체 저장된 작자 미상이 저장됨
		//this(title, "작자미상")이 부분을 통해 저장됨
		
		
	loveStory.show();
//		원래는 이걸 적는 코드! 잠시 없애고 Ex_15(String title, String author)에 System.out.println(title + " " + author); 적어보자.
		littlePrince.show();
//		
	emptyBook.show();


	}

}
