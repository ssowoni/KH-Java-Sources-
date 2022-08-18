package class_211224;

public class today_task1 {

	public static void main(String[] args) {
		//45개의 배열 방을 생성한다. 
		int rNum[] = new int[45];
		//숫자의 범위, 여기서 blooean은 중복 체크
		boolean room [] = new boolean[45];
		int index = 0;
		int rnd;
		
		while(index < 6) {// 6개에만 값을 집어넣겠다는 의미
			//rnd는 0부터 45사이 난수를 출력한다.
			rnd =(int)(Math.random()*45);
			if(!room[rnd]) { // room[rnd]값이 false라면 즉 값이 없다면 
				room[rnd] = true;//room[rnd] 난수 위치에 있는 배열에 값을 넣는다.
				rNum[index] = rnd +1;// 그 값은 rNum[0~5]=rnd+1 
				index ++;
			}
		}
		//만약에 아래 000을 빼고 6개만 추출하고 싶다면 이렇게! 
		for (int i = 0; i<6; i++) {
		//for (int i = 0; i<rNum.length; i++) {
			System.out.print(rNum[i]+ " ");
			if((i+1)%3 ==0) {
				System.out.println();
			}
		}

	}
}
