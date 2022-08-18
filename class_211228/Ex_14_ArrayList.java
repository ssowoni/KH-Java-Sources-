package class_211228;

import java.util.ArrayList;

public class Ex_14_ArrayList {

	public static void main(String[] args) {
		//ArrayList 객체 변수 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> cha = new ArrayList<Integer>();
		ArrayList<Integer> kyo = new ArrayList<Integer>();
		ArrayList<Integer> hap = new ArrayList<Integer>();
		
		//변수입력, list1과 2에 데이터를 입력하고 교집합, 합집합, 차집합 계산한다. 
		//↓list1(1,2,3,4)
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		//↓list2(3,4,5,6)
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		cha.addAll(list1); // cha(1, 2, 3, 4)
		cha.removeAll(list2);//cha(1,2)
		hap.addAll(cha); // hap(1, 2)
		hap.addAll(list2);//hap(1, 2, 3, 4, 5, 6)
		kyo.addAll(list1); // kyo(1, 2, 3, 4)
		kyo.removeAll(cha);//kyo(3,4)
		
		System.out.println("교집합 : " + kyo);
		System.out.println("합집합 : " + hap);
		System.out.println("1-2, 차집합 : "+ cha);

	}

}
