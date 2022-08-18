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



class MyPanel extends JPanel  {
	BufferedImage img = null;
	//자동차 초기 위치 설정한다. 
	int img_x = 100;
	int img_y = 100;
	
	public MyPanel(){
		try {
			//해당 경로에 있는 이미지 파일 객체 생성
			img = ImageIO.read(new File("c://temp//car1.gif"));
			//경로에 이미지 파일이 없을 경우 에러 출력
		}catch(IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		
		//↓무명클래스
		//무명 클래스는 해당 시점에서 동작한 후 사라지며 다른 부분에서 접근이 불가능 하다.
		addKeyListener(new KeyListener(){
			//★keyPressed, keyReleased,keyPressed  k소문자로 적어준다.
			//keyTyped(KeyEvent e) : 문자를 눌렀을 때 호출, 문자키에만 반응합니다.
			//keyReleased(KeyEvent e) : 키보드를 땟을 때 호출, 모든 키보드에 반응합니다.
			//keyPressed(KeyEvent e) : 키보드를 눌렀을 때 호출, 모든 키보드에 반응합니다.
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				//방향키를 사용해 이미지 이동
				case KeyEvent.VK_UP:    img_y-=10; break;
				case KeyEvent.VK_DOWN:    img_y+=10; break;
				case KeyEvent.VK_LEFT:    img_x-=10; break;
				case KeyEvent.VK_RIGHT:    img_x+=10; break;
				
				}
				//키보드 이벤트가 진행되면 repaint 메소드가 실행돼 이미지를 실시간으로 업데이트함
				repaint();
			}
			//무명 클래스는 구현하지 않은 메소드들도 모두 적어준다.!!
			//구현하지 않은 메소드들 key적을 때 대문자로 적어 차가 안 움직였다.
			public void keyReleased(KeyEvent arg0) {     }
			public void keyTyped(KeyEvent arg0) {     }

		});

		//해당 객체에 Focus를 주는 메소드
		this.requestFocus();
		setFocusable(true);
		
	}
	//paintComponent: 스윙 컴포넌트가 자신의 모양을 그리는 메소드
	public void paintComponent(Graphics g) {
		//패널 내에 이전의 잔상을 지우기 위한 메소드
		//즉) 기존의 모양에 변화를 주고 싶을 때
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

//JFrame : 그래픽 인터페이스 외곽 부분을 담당하는 클래스

public class Ex_10_14CarGame extends JFrame {
	
	public Ex_10_14CarGame() {
		//JFrame의 타입을 생성
		setTitle("Car 키보드 방향키로 움직이게 하기");
		//JFrame의 사이즈 
		setSize(600,600);
		//윈도우 창을 닫으면 프로세스까지 완전히 종료하게 해주는 메소드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Mypanel 생성자 실행
		add(new MyPanel());
		//JFramd 이 보여지는지 여부 선택
		setVisible(true);

	}
	//메인 메소드가 실행되면 Ex_10_14CarGame 생성자를 실행함
	//여기서 메인 메소드는 프로그램 실행의 기능만 담당
	public static void main(String[] args) {
		Ex_10_14CarGame s = new Ex_10_14CarGame();
	}
	

}

