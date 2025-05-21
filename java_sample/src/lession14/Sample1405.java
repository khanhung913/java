package lession14;

public class Sample1405 {
	public static void main(String[] args) {
		Human1405 human= new Human1405();
		
		Phone1405 phone1= new Phone1405();
		phone1.phoneName="ApplePhone";
		
		Phone1405 phone2= new Phone1405();
		phone2.phoneName="AndroidPhone";
		
		human.buyPhone(phone1);
		human.buyPhone(phone2);
	}
}
