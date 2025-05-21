package question03;

public class Teacher {
	String name;
	int age;
	String address;

	public String getAddress() {
		return this.address;
	}

	public void setTeacherInfo(String name) {
		this.name = name;
	}

	public void setTeacherInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setTeacherInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
}
