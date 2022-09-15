package threads;

class tthread extends Thread
{
	private Thread thread;
	private String threadname;
	
	tthread(String msg)
	{
		threadname=msg;
		System.out.println("CREATING THREAD "+ threadname);
	}
	
	public void run()
	{
		System.out.println("RUNNNING THREAD"+threadname);
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("THREAD :"+threadname+","+i);
				Thread.sleep(50);
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println("EXCEPTION IN THREAD :"+threadname);
		}
		System.out.println("THREAD :"+threadname+"CONTINUE.....");
	}
	
	public void start() {
		System.out.println("START METHOD "+threadname);
		if(thread==null)
		{
			thread = new Thread(this,threadname);
			thread.start();
		}
	}
}


public class multipleusingextendingthread {

	public static void main(String[] args) {
		tthread t1=new tthread("fthriead");
		t1.start();
		tthread t2=new tthread("sthriead");
		t2.start();
		

	}

}
