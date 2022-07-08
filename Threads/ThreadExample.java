package Threads;
public class ThreadExample extends Thread {

	public void run()
	{
		for( int i=0;i<3;i++)
		{
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("State of the Thread"+Thread.currentThread().getState());
			System.out.println("Get the name of the Thread"+Thread.currentThread().getName());
			System.out.println("Check if the Thread is alive"+Thread.currentThread().isAlive());
			System.out.println("Check if the Thread is Daemon"+Thread.currentThread().isDaemon());
		}
	}
	public static void main(String args[])
	{
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		ThreadExample t3 = new ThreadExample();
		t1.setName("Amazon");
		t2.setName("Netflix");
		t3.setName("flipkart");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	
	}
}
