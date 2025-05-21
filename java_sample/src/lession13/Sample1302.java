package lession13;

public class Sample1302 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human1302 human=new Human1302();
		Phone1302 phone =new Phone1302();
		
		human.name="田中太郎";
		human.phone=phone;
		human.phone.fee=5000;
		
		System.out.println("料金は"+human.phone.fee+"円です。");
		System.out.println("携帯電話の持ち主は"+human.name+"です。");
		
	}

}
