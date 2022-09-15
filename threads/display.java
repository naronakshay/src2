package threads;

public class display extends Thread  {

	public static void main(String[] args) {
		display t = new display();
		t.setName("th1");
		t.start();
		ThreadGroup c= Thread.currentThread().getThreadGroup();
		int n=c.activeCount();
		Thread [] l=new Thread[n];
		c.enumerate(l);
		
		for(int i =0;i<n;i++)
			System.out.println("THREAD NO "+i+"="+l[i].getName());
		

	}

}
