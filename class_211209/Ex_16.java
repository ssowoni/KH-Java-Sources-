package class_211209;

import java.util.Random;

public class Ex_16 {

	public static void main(String[] args) {
		Random generator = new Random();
		int randomnumber;
		randomnumber = generator.nextInt(6) + 1;
		//nextline(int num) 은 0과 (num-1) 사이에 있는 난수를 반환한다.
		//원래 nextline의 값이 0, 1, 2, 3, 4, 5 인데 거기에 +1을 더한 값을 반환한다.
		System.out.println("난수: " + randomnumber);

	}

}
