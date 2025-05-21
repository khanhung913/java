package lession19;

public class Sample1908 {

	public static void main(String[] args) {
		Airplane1908 airplane1 = new Airplane1908();
		airplane1.setAirplane(1111, 30);

		Airplane1908 airplane2 = airplane1;
		airplane2.setAirplane(2222, 50);

		airplane1.showAirplane();
		airplane2.showAirplane();

	}

}
