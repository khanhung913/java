package lession23;

public class Teacher2301 extends Worker2301 {

	protected Teacher2301( String name, int age) {
		super(Constant2301.TEACHER, name, age);
	}
	public void doWork() {
		System.out.println("知識を教えます。");
	}

}
