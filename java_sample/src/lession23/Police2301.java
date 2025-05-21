package lession23;

public class Police2301 extends Worker2301 {

	protected Police2301(String name, int age) {
		super(Constant2301.POLICE, name, age);
	}

	public void doWork() {
		System.out.println("地域や人々の安全を守ります。");
	}

}
