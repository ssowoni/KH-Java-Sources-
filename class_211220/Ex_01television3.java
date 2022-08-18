//오늘의 과제 
//get채널 set채널 다시 공부하자 
//get만 써서 다시 코드 작성해보자
package class_211220;

public class Ex_01television3 {

		int channel;
		int volume;
		boolean onOff;
		
		//getter 메소드
		public int getChannel() {
		return channel;
		}
		//setter 메소드 
		public void setChannel(int channel) {
		this.channel = channel;
		}
		//print 메소드
		void print() {
			System.out.println("텔리비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다");

	}
}


