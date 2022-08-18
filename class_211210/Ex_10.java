package class_211210;

public class Ex_10 {

	public static void main(String[] args) {
		int hap = 0;
		int i;
		
		for(i =1; i <=50; i++) {
			if(i % 3 == 0)
				continue;
			//continue문을 만나면 블록의 남은 부분을 건너뛰고 반복문의 처음으로 간다. 
			//즉 3으로 나눴을 때 0이 나오는 값은 3의 배수를 의미한다. 따라서 3의 배수들은 건너 뛰게 되는 것!
			hap += i; //hap = hap +i -> 누적이라고 한다
		}
		System.out.printf("1~100까지의 합(3의 배수 제외) : %d\n", hap);

	}

}
