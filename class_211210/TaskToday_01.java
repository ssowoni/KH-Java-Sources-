package class_211210;


import java.util.Random;


public class TaskToday_01 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		/*int pnumber = 0;
		pnumber = rand.nextInt(4)+2;
		pnumber = rand.nextInt(6)+1;
		*/
		
		int i = 0 ,pnumber = 0;
		while(i<12) {
			for(i=0; i<4; i++)
			{
				if(i==0)
					System.out.print(0);
				else if (i==1)
					System.out.print(rand.nextInt(4)+2);
				else if (i==2)
					System.out.print(rand.nextInt(6)+1);
				else if (i==3)
					System.out.print("-");	
			}
				
		for(i=4; i<7; i++)
		{
			System.out.print(rand.nextInt(10));
		}
		
		if(i==7) {
			System.out.printf("-");
			
		}
		for(i=8; i<12; i++)
		{
			System.out.print(rand.nextInt(10));
		
		}
	

		
		
		/*int pnumber1=0,pnumber2=0,pnumber3=0, first=0, two=0, three=0;
		
		pnumber1 = first + two + three;
		//String fisrt = "0";
		two = rand.nextInt(4)+2;
		three = rand.nextInt(6)+1;
		
		pnumber2 = rand.nextInt(1000)-1;
		pnumber3 = rand.nextInt(10000)-1;
		
		System.out.printf("전화번호: %d - %d - %d",pnumber1, pnumber2, pnumber3);
		*/
		
		
			}
		}
	}


	

/*int[] pnumber = new int[14]; 


pnumber[0] = 0;
//pnumber[1] = 1;
//pnumber[2] = 2;
pnumber[1] = Random.nextInt(4)+2;
pnumber[2] = rand.nextInt(6)+1;

System.out.println("전화번호 : " + Arrays.toString(pnumber));

*/