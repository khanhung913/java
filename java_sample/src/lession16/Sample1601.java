package lession16;

public class Sample1601 {

	public static void main(String[] args) {
		Human1601 human1 = new Human1601();
		Human1601 human2 = new Human1601();
		human1.setProfile("田中太郎");
		human1.setProfile(22);

		human2.setProfile("渡辺花子", 21);

	}

}
