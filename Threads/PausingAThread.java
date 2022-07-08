package Threads;
public class PausingAThread implements Runnable {

	
		public void run() {
			try {
				Thread.sleep(5000); //Pause a thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Downloading a file! " + Thread.currentThread().getName());
		}
	

	public static void main(String[] args) {
		System.out.println("Main Thread : " + Thread.currentThread().getName());
		PausingAThread downloadFileTask = new PausingAThread();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(downloadFileTask, "MyNameGiven-"+i);
			thread.start(); // internally -> invokes run method
		}
	}
}