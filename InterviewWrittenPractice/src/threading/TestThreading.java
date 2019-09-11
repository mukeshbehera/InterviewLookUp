package threading;

public class TestThreading extends Thread{
	
	static int x = 0;
	
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("printing from run() method: "+ ++x);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		TestThreading td = new TestThreading();
		td.start();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("printing from main() method:"+ ++x);
			td.notify();
		}
		
	}

}
