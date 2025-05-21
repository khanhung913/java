package question03;

public class Student {
	private String name;
	private int age;
	static int totalStudent = 0;

	public Student() {
		totalStudent++;
	}

	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getTotalStudent() {
		return totalStudent;
	}

	public static void setTotalStudent(int totalStudent) {
		Student.totalStudent = totalStudent;
	}

}
