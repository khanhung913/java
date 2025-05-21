package lession14;

public class Sample1406 {
	public static void main(String[] args) {
		Human1406 satou= new Human1406();
		
		String fullName=satou.sayFullName("佐藤", "一郎");
		double bmi=satou.calcBmi(70, 175);
		
		System.out.println(fullName+"のBMIは"+bmi+"です。");
	}
}
