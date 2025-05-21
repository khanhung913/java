package lession23;

public class Display2301 {
	public static void dislayWorkers(Worker2301[] workers) {
		for (Worker2301 worker : workers) {
			worker.showIntroduction();
			worker.doWork();
		}
	}
}
