package question11;

public class Book {
	private String title;
	private int price;
	
	public Book(String title,int price) {
		this.title=title;
		this.price=price;
	}
	public void show() {
		System.out.println("本のタイトルは「"+title+"」です");
		System.out.println("価格は"+price+"円です");
	}
}
