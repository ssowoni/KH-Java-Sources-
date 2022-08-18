//3번 방식
package class_211231;

//import java.awt.Container;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Ex_10_04 extends JFrame {
	public Ex_10_04() {
	
	setTitle("Action 이벤트 리스너 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton btn = new JButton("Action");
	c.add(btn);
	
	//↓이 부분이 무명 클래스 부분이다.
	//무명 클래스는 해당 시점에서 동작한 후 사라지며 다른 부분에서 접근이 불가능 하다.
	//괄호 항상 확인하자.
	btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			//무명 클래스이므로 이전 예제와 다르게 객체 지정 없이 바로 타이틀 변경이 가능하다.
			//계속 몇번이고 변경 가능.
			setTitle(b.getText());
		}
		//
	});
	setSize(350,150);
	setVisible(true);
}

	public static void main(String[] args) {
		new Ex_10_04();
	}
	}
