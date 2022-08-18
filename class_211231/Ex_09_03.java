//2번 방식
package class_211231;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Ex_09_03 extends JFrame {
	//해당 부분의 내용은 이전 02번 예제와 동일하다.
	public Ex_09_03(){
		
		//JFrame 제목
		setTitle("Action 이벤트 리스너 예제");
		//JFrame 창이 종료되면서 프로그램도 같이 종료된다. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//최상위 클래스인 Container 객체를 생성한다. 
		//★이 c 객체에 다른 컨테이너 (panel이나 label 객체)를 추가하는 방식
		Container c = getContentPane();
		//setLayout : 컴포넌트가 배치되는 방식
		//FlowLayout : 왼쪽에서 오른쪽, 위에서 아래로 배치된다.
		c.setLayout(new FlowLayout());
		//버튼 객체를 생성하는데 여기다 Action이라는 문구를 출력한다. 
		JButton btn = new JButton("Action");
		//addActionListener : 이벤트를추가함
		//MyActionListner 클래스의 생성자를 이벤트로 추가
		btn.addActionListener(new MyActionListener() );
		//버튼 객체를 컨테이너에 추가 
		c.add(btn);
		//↓컨테이너 (JFrmae객체)의 크기를 결정하고
		//즉 프레임 사이즈 설정
		setSize(350,150);
		//↓setVisible : 초기 전시여부를 결정한다.
		//프레임 보이게 설정 ( 반드시 true)
		setVisible(true);
		
	}
	
	//이게 바로 내부 클래스다
	//외부 클래스인 Ex02와 함께 사용되어 코드를 간결하게 유지할 수 있다.
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Actoin");
			//InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있다.
			//프레임 타이틀에 버튼 문자열을 출력한다 이 부분만 다르다
			Ex_09_03.this.setTitle(b.getText());
			
		}
	}
	//이번에도 메인 클래스는 메인 클래스의 생성자만 호출
	public static void main(String[]args) {
		new Ex_09_03();


}

}