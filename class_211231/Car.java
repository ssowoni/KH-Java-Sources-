package class_211231;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 100;
	int img_y = 100;
	
	public MyPanel() {
		try{
			img = ImageIO.read(new File("c://temp//car1.gif"));
			
		}catch(IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		
//		btn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JButton b = (JButton)e.getSource();
//				if(b.getText().equals("Action"))
//					b.setText("액션");
//				else
//					b.setText("Action");
//				
//				//무명 클래스이므로 이전 예제와 다르게 객체 지정 없이 바로 타이틀 변경이 가능하다.
//				//계속 몇번이고 변경 가능.
//				setTitle(b.getText());
//			}
//			//
//		});
//		
		addKeyListener(new KeyListener() {
			public void KeyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP:  img_y -= 10; break;
				case KeyEvent.VK_DOWN: img_y +=10 ; break;
				case KeyEvent.VK_LEFT: img_x -=10; break;
				case KeyEvent.VK_RIGHT: img_x +=10; break;
				}
				repaint();
			}
			public void keyReleased(KeyEvent arg0) {    }
			public void KeyTyped(KeyEvent arg0){     }
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.requestFocus();
		setFocusable(true);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}


public class Car extends JFrame{
	public Car() {
		setSize(600, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		Car s = new Car();

	}

}
