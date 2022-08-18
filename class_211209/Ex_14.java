package class_211209;

public class Ex_14 {

	public static void main(String[] args) {
		
		int num = 0;
		
		while (true) {//주어진 조건이 만족되는 동안 문장을 반복 실행한다.
			System.out.print(num + " ");//옆으로 띄어쓰기 하려고 " " 더해줬다.
			num++;//쭉 수가 커지다가
			if(num ==10)// 10이 되면 빠져나간다.
				break;
		}

	}

}
