package lession20;

public class Sample2006 {
	public static void main(String[] args) {
		Phone2006[] phones = new Phone2006[2];
		phones[0] = new Phone2006();
		phones[1] = new SmartPhone2006();
		for (Phone2006 phone : phones) {
			phone.show();
		}
	}
}
