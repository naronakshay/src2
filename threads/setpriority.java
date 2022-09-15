package threads;

 class ThreadP  extends Thread{
	public void run()
	{
		String tn=Thread.currentThread().getName();
		int tp=Thread.currentThread().getPriority();
		System.out.println(tn+"has priority"+tp);
	}
}

public class setpriority {

	public static void main(String[] args) {
		ThreadP  t1= new ThreadP();
		ThreadP  t2= new ThreadP();
		ThreadP  t3= new ThreadP();
		ThreadP  t4= new ThreadP();
		t1.setPriority(3);
		t2.setPriority(2);
		t3.setPriority(1);
		t4.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
