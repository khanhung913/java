package lession23;

public class Sample2301 {

	public static void main(String[] args) {
		Worker2301[] workers= new Worker2301[3];
		workers[0]= new Police2301("田中", 28);
		workers[1]= new Teacher2301("佐藤", 53);
		workers[2]= new Chef2301("鈴木", 31);
		
		Display2301.dislayWorkers(workers);
	}

}
