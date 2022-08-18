//에러 나왔다!! 
//int key2 = kv2.getKey();
//String value2 = kv2.getValue(); 여기서 자료형을 바꾸지 않고 String int로 사용했다. 자료형 확인 
package class_211228;
public class Ex_04_01 {

	public static void main(String[] args) {
		// KeyValue 라는 메소드에 String, Integer라는 인자를 넘겨서 
		//String,Integer 타입의 KeyValue 를 리턴받는다는 의미 
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		//setKey라는 메소드에 "사과"값을 입력한다. 
		kv1.setKey("사과");
		kv1.setValue(1000);
		//setKey로 입력한 값을 getKey로 받아온다.
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key: " + key1 + " value: " + value1);
		
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없음)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key: " + key2 + " value: " + value2);
		
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		System.out.println("key: " + key3);
	}
}
