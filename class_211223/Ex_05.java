package class_211223;


interface Repairable {}

	// 유닛이 갖는 공통 성질을 가진 최상위 클래스
class Unit {
	   int hitPoint;
	   final int MAX_HP;
	   Unit(int hp) {
	      MAX_HP = hp;
	   }
	}
	// 유닛의 큰 범주를 나누는 클래스
class GroundUnit extends Unit {
	   GroundUnit(int hp) {
	      super(hp);
	   }
	}
	// 유닛의 큼 범주를 나누는 클래스
class AirUnit extends Unit {
	   AirUnit(int hp) {
	      super(hp);
	   }
	}
	// 세부 유닛 클래스
	// 상위 클래스의 성질을 상속 받음
class Tank extends GroundUnit implements Repairable {
	   Tank() {
	      super(150);
	      hitPoint = MAX_HP;
	   }
	   public String toString() {
	      return "Tank";
	   }
	}
	// 세부 유닛 클래스
	// 상위 클래스의 성질을 상속 받음
	class Marine extends GroundUnit {
	   Marine() {
	      super(40);
	      hitPoint = MAX_HP;
	   }
	}
	// 세부 유닛 클래스
	class SCV extends GroundUnit implements Repairable {
	   SCV() {
	      super(60);
	      hitPoint = MAX_HP;
	   }
	   // repair라는 세부 동작이 추가됨
	   // 매개변수로 Repairable 객체를 받는다
	   void repair (Repairable r) {
	      // 받은 Repairable 객체가 Unit클래스이거나 그 후손 클래스이면
	      if(r instanceof Unit) {
	         // Unit 타입으로 업 캐스팅하고
	         Unit u = (Unit)r;
	         // 해당 객체의 MAX_HP 까지 hitPoint를 증가 시킨다
	         while(u.hitPoint != u.MAX_HP)
	            u.hitPoint++;
	      }
	   }
	}
	public class Ex_05  {
	   public static void main(String[] arge) {
	      // 각 유닛의 객체 생성
	      Tank tank = new Tank();
	      Marine marine = new Marine();
	      SCV scv = new SCV();
	      // scv에 있는 repair 동작 수행
	      // 객체 변수 tank는 Repairable 인터페이스에 의해 동작이 일어나야 하는데
	      // 본 코드에는 그러한 동작이 없으므로 아무 일도 발생하지 않음
	      scv.repair(tank);
	   }
	}
	// 오늘의 과제
	// 아래 출력 결과가 나오게 하기
	// Tank 수리 완료
	// Tank의 hp : 150
	// Marine의 hp : 40
	// SCV의 hp : 60


