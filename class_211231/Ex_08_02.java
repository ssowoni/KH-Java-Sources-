//import 생성하는 부분 잘 알아두자!
//1번 방식
package class_211231;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Ex_08_02 extends JFrame {
	public Ex_08_02(){
	
	//JFrame 제목 설정
	setTitle("Action 이벤트 리스너 예제");
	//JFrame 창 종료 시 프로그램도 같이 종료
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//contaiser c = getContentPane() : 최악관 컨테이너를 표현하는 객체 
	//이 c 객체에 다른 컨테이너 (panel이나 label 객체)를 추가하는 방식
	//container 클래스는 JFrame 클래스의 조상 클래스가 된다
	Container c = getContentPane();
	
	
	//setLayout : 컴포넌트가 배치되는 방식
	//FlowLayout : 왼쪽에서 오른쪽, 위에서 아래로 배치된다.
	c.setLayout(new FlowLayout());
	
	//JButton: 버튼객체, 기본 생성자를 통해 이름을 Action으로 지정 
	JButton btn = new JButton("Action");
	
	
	//addActionListener : 이벤트를추가함
	//MyActionListner 클래스의 생성자를 이벤트로 추가
	
	btn.addActionListener(new MyActionListener() );
	//버튼 객체를 컨테이너에 추가함
	c.add(btn);
	
	//↓컨테이너 (JFrmae객체)의 크기를 결정하고
	//즉 프레임 사이즈 설정
	setSize(350,150);
	//↓setVisible : 초기 전시여부를 결정한다.
	//프레임 보이게 설정 ( 반드시 true)
	setVisible(true);
	
}

	public static void main(String[] args) {
		new Ex_08_02();
	}

}
//ActionListener를 상속(구현)함
class MyActionListener implements ActionListener{
	//이벤트 발생 시 전달받은 ActionEvent 객체 e는
	//Action 이벤트 발생하면 호출된다.
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		//만약 버튼이 눌렸는데 문구가 "Action"이라면
		if(b.getText().equals("Action"))
			//문자를 액션으로 바꾸며
			b.setText("액션");
			//누른 후 "액션"으로 출력됐다면 다시 "Action"이라고 바꾼다.
		else
			b.setText("Action");
					
	}
}
