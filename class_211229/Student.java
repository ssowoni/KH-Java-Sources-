package class_211229;

public class Student <K, V>{

	private K id;
	private V tel;
	
	public Student(K id, V tel) {
		this.setId(id);
		this.setTel(tel);
	}

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	public V getTel() {
		return tel;
	}

	public void setTel(V tel) {
		this.tel = tel;
	}
	

}
