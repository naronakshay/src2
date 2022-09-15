package threads;

public class fibrev {

	public static void main(String[] args) {
		
		try {
			fib f=new fib();
			f.start();
			f.sleep(4000);
			rev r=new rev();
			r.start();
			r.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
