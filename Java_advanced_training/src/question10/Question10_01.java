package question10;

public class Question10_01 {

	public static void main(String[] args) {
		Profile profile= new Profile();
		profile.setAge(20);
		profile.setName("マイケル");
		System.out.println("私の名前は"+profile.getName()+"です");
		System.out.println("年齢は"+profile.getAge()+"です");
	}

}
