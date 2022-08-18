//주말 숙제 창에 가위, 보라고 문구 뜨게 하기! 
package class_211217;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

//public class Weekend_task {
	
	public class Weekend_task extends JFrame{
		//부모인 JFrame을 상속받아 Weekend_task가 가져다 쓰겠다. 
		
	private static final long serialVersionUID = 1L;
	Weekend_task() {
		//setDefaultClodseOperation(JFram.EXIT_ON_CLOSE) : 창 닫기 (X 버튼)를 눌러도 창만 닫힐 뿐 프로그램은 종료되지 않는데
		//아래 문을 추가하면 창을 닫을 때 프로그램도 종료된다. 
		//setDefaultClodseOperation(
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("대박");
		
		setLayout(new FlowLayout());
		
		//버튼 객체 생성, 버튼에 가위바위보 생성 
		Button btn1 = new Button("가위");
		Button btn2 = new Button("바위");
		Button btn3 = new Button("보");
		
		//JFrame 객체에 버튼 추가
		add(btn1);
		add(btn2);
		add(btn3);
		
		//각 버튼의 배경색 지정
		btn1.setBackground(Color.CYAN);
		btn3.setForeground(Color.RED);
		
		//버튼 2번을 비활성화 시킴 setEnabled(false)
		btn2.setEnabled(false);
		setBackground(Color.PINK);
		setForeground(Color.RED);
		
		//JFrame의 사이즈 지정 (200, 200) 픽셀 사이즈 (픽셀은 알아서 찾아보시길)
		setSize(200, 200);
		
		//setSize(true) : 코드 실행 시, GUI를 표시할지 결정하는 메소드
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Weekend_task();

	}

}
