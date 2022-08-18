package class_211216;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		int x, y;
		Scanner scanner = new Scanner(System.in);
		
		//초기 놔진 곳이 없으므로 빈 공간으로 표시한다
		for ( int i = 0; i <3; i++)
			for( int j =0; j <3; j++)
				board[i][j] = ' ';
	
		
		//여기서 부터 게임 시작
		//do while문 무한루프 시작
		do {
			for(int i = 0; i <3; i++) {
				//그림판을 그린다. 
				System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
				//해당 위치에 ---을 표시할지, |표시할지 결정한다. 그 사이 공간에 말을 표시한다. 
				//i 가 2가 아니면 ---|---|--- 출력 이말은 즉슨 위에 문장 실행 후 아래 문장 실행 즉 빙고판 만든다. 
				if( i != 2)
					System.out.println("---|---|---");
			}
			
			System.out.print("다음 수의 좌표를 입력하시오 : ");
			x = scanner.nextInt();
			y = scanner.nextInt();
			//scanner을 활용해 int 타입의 값을 변수 입력
			//nextInt() : 정수형 변수 입력
			
			
			//↓입력된 좌표의 배열값이 비어있지 않으면 에러를 표시한다. 
			//이 말은 즉슨 비어있어야 값을 널 수 있다!  값이 있으면 에러
			if(board[x][y] != ' ') {
				System.out.println("잘못된 위치입니다.");
				continue; // 건너 뛴다. 
			}else 
				//아니라면 입력한 x행 y열에  X표시 (X표시가 플레이어)
				board[x][y] = 'X';
			
			int i = 0, j=0; 
			// ↓이부분은 컴퓨터가 자동으로 놓는 부분이다 2차원 FOR문으로 비어있는 공간을 확인하면 FOR문을 빠져나감
			for( i =0; i<3; i++) {
				for(j= 0; j <3; j++)
					if(board[i][j] == ' ')
						//0표시가 없는지 확인 
						break;
				
				//아래 조건을 실행하지 않으면 배열 범위를 넘어설 수 있다. 
				if( i ==3)
					i--;
				if( j == 3)
					j--;
				if(board[i][j] == ' ')
					break;
				//X표시 없는지 확인한다. 
			}
			
			if(i < 3 && j <3)
				board[i][j] = 'O';
			//두 가지 모두 없는것을 확익 한 후, 배열 범위 내에 좌표가 있으면 O출력
			//if(조건문)은 true false 값만 받기 때문에 && 연산자로 묶어줬다. 
				
		}while(true);

		
	}

}
