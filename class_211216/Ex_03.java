package class_211216;

public class Ex_03 {

	public static void main(String[] args) {
		double score[][] = { {3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		//부동소수점 타입인 2차원 배열 score 변수 생성
		int term, year; // term은 학기 즉 열을 , year 행을 나타낸다. 
		int n = 0, m=0;
		//변수를 합할 double 타입 sum 변수 생성
		double sum = 0;
		
		
		//이전 예제와 동일한 2차원 for문을 활용해 2차원 데이터를 활용한다.
		//score.length를 통해 score 행의 개수 획득 
		for( year = 0; year < score.length; year++) {
			for(term = 0; term < score[year].length; term++) {
				//score[year].length를 활용해 score의 열의 개수 획득
				
				sum += score[year][term];// 각 행과 열에 있는 값 더하기 		
			}	
			}
			//score 배열의 행의 개수와 열의 개수 획득 
			n = score.length;// 길이가 4라는 걸 획득했고
			m = score[0].length;//열은 2열이라는 걸 획득 
		
		System.out.println("4년 전체 평점 평균은" + sum / (n*m));
		//sum/(n*m)을 활용해, 배열의 모든 변수 개수를 구하고 그 값으로 sum을 나눠 평균을 구한다. 

	}

}
