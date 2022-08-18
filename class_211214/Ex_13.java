// 배열 총정리 다시 정리해서 작성!!
package class_211214;

public class Ex_13 {

	public static void main(String[] args) {
		
		//className, name, score 각각 배열에 초기값 받기
		String[] className = {"이름", "국어", "영어", "수학", "총점", "평균" };
		String[] name = {"이효리", "투피엠", "태진아", "씨스타" };
		int [][] score = { {90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {80, 80, 80}};
		
		//배열과 변수 선언 
		int sum=0, average=0; // 각각 사람의 점수 합
		int[] TotalScore = new int[5]; 
		int[] AverageScore = new int[5];
		int TotalSum =0, AverageSum = 0;
		
		System.out.printf("성적표\n");
		for(String st : className) 
			System.out.print(st + "\t");
		System.out.println();// 밑으로 한 칸 뛴다는 얘기 
		
		for(int i=0; i <44; i++)
			System.out.print("=");
		System.out.println();
		
		for(int i = 0; i <name.length; i++) {
			System.out.print(name[i] + "\t");
			//i= 0부터 시작 그렇다면 이효리: 값을 출력하기 위해 다음 for문으로 넘어간다.
			for(int j = 0; j <3; j++) {//for문 첫 번째 현재 i값은 0
				System.out.print(score[i][j] + "\t");
				// score [0][0], score[0][1],,,이런식으로 j<3일때 까지 출력
				sum += score[i][j]; //sum = sum + score[i][j] 1행 이효리의 sum 240
				TotalScore[j] += score[i][j];// TotalScore[j] = TotalScore[j] + score[i][j]
				//sum = TotalScore[j]
			}
			
			TotalSum += sum; // Totalsum에 sum값 저장된다. 
			average = sum /3; //평균은 sum을 3으로 나눈 값. 
			AverageSum += average;//AverageSum에 average값 저장 
			System.out.print(sum + "\t"); // 각 사람별로 모든 점수의 총점
			System.out.println(average);  //각 사람별로 모든 점수의 평균
			// 평균이 마지막 열이므로 println으로 문장 다음 문당으로 enter
			sum = 0;
			average = 0;
		}
		
		for(int i=0; i <44; i++)
			System.out.print("=");
		System.out.println();
		
		System.out.print("총점" + "\t");
		//총점에 값 할당하기 
		TotalScore[3] = TotalSum;  
		TotalScore[4] = AverageSum;
		AverageScore[3] = TotalSum / 4;
		AverageScore[4] = AverageSum / 4;
		
		for (int j =0; j <5; j++) {
			System.out.print(TotalScore[j] + "\t");
		}
		
		System.out.println();
		System.out.print("평균" + "\t");
		for(int j =0; j <5; j++) {
			AverageScore[j] = TotalScore[j] /4;
			System.out.print(AverageScore[j] + "\t");
		}
		
	}

}
