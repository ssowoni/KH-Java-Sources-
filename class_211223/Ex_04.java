// 오늘 과제
//출력결과 이렇게 나와야 한다.  
//Tank 수리완료
//Tank의 hp : 150
//Marine의 hp : 40
//SCV의 hp는 : 60
package class_211223;
interface Repairable{}

//유닛이 갖는 공통 성질을 가진 최상위 클래스
class Unit{
	int hitPoint;
	final int MAX_HP;
	/*Repairable*/ String u;
	Unit(int hp){
		MAX_HP = hp;
		//System.out.println(hp);
	}

//	Unit(Repairable r ){
//		this.r = r;
//	}
	
//	@Override
//	public String toString() {
//		return u;
	
}
//}

//유닛의 큰 범주를 나누는 클래스
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

//유닛의 큰 범주를 나누는 클래스
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

//세부 유닛 클래스
//상위 클래스의 성질을 상속 받음
class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
		
	}
	//@Override
	public String toString() {
		return "Tank";
	}
}
//세부 유닛 클래스
//상위 클래스의 성질을 상속 받음
class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}
//세부 유닛 클래스 
class SCV extends GroundUnit implements Repairable{
	
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	//repair라는 세부 동작이 추가되어있다.
	void repair(Repairable r) {
		//Unit name = new Unit(r);
		//instanceof 현재 레퍼런스가 어떤 클래스형의 객체 주소를 참조하고 있는지 알고싶을 때 사용
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			//super(u);
			//System.out.println("Tank 수리완료");
			System.out.println(u.toString()+"수리완료");
			
		}
	}
}

public class Ex_04 {


	public static void main(String[] args) {
		//각 유닛의 객체 생성
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		//scv에 있는 repair 동작 수행
		//객체 변수 tank는 Repairable 인터페이스에 의해 동작이 일어나야 하는데
		//본 코드는 그러한 동작이 없으므로 아무 일도 발생하지 않는다.
		scv.repair(tank);
		
		//System.out.println(tank);
		System.out.println("Tank의 hp: "+ tank.MAX_HP);
		System.out.println("Marine의 hp: "+marine.MAX_HP);
		System.out.println("Scv의 hp: "+scv.MAX_HP);
		
	}
}
// 오늘 과제
//출력결과 이렇게 나와야 한다.  
//Tank 수리완료
//Tank의 hp : 150
//Marine의 hp : 40
//SCV의 hp는 : 60
