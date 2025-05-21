package lession18;

public class Sample1801 {

	public static void main(String[] args) {
		Student1801.showSum();
		Student1801 student1= new Student1801(1, "まなみ", "女", 19);
		Student1801.showSum();
		Student1801 student2= new Student1801(2, "けんた","男", 22);
		Student1801.showSum();
		student1.show();
		student2.show();

	}

}
