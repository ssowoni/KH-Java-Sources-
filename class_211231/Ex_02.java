package class_211231;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import java.awt.Container;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import java.awt.FlowLayout;
////import java.awt.MyactionListener;
////import java.awt.ActionEvent;

public class Ex_02 extends JFrame{
	public Ex_02() {
		
		setTitle("Action 이벤트 리스너 예제");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyactionListener());
		
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new Ex_02();

	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
	}

}
