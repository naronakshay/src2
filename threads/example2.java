package threads;

class Multi2 implements Runnable
{
	public void run()
	{
		System.out.println("thread is running");
	}
}
public class example2 {

	public static void main(String[] args) {
		Multi2 m=new Multi2();
		Thread t=new Thread(m);
		t.start();
		
	}

}
