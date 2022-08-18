//get메소드, set 메소드 다시 공부하기 
package class_211220;

public class Ex_03television {

		//클래스 필드 생성
		int channel;
		int volume;
		boolean onOff;
		
		//print() 메소드 
		void pirnt() {
			System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + " 입니다.");
		
	}	//getter 메소드
		//필드에 기록된 값을 읽어서 요구하는 쪽으로 값을 넘긴다. 
		int getChannel() {
			return channel;
		}
		
		//setter메소드는 변경할 값을 전달받아 필드값을 변경한다. 
		void setChannel(int ch) {
			channel = ch;
		}
//		void setChannel(int channel) {
//			this.channel = channel;
//		}

}
