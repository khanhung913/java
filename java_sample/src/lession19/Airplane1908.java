package lession19;

public class Airplane1908 {
	private int no;
	private int capacity;
	
	public Airplane1908() {
		no=0;
		capacity=0;
	}
	
	public void setAirplane(int no,int capacity) {
		this.no=no;
		this.capacity=capacity;
	}
	public void showAirplane() {
		System.out.println("機体番号:No."+no);
		System.out.println("定員："+capacity+"名");
	}
}
