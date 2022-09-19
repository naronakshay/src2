package inheritance;

	interface language{
	    void getName(String name);
	}

	
public class string implements language {
	public void getName(String name)
    {
        System.out.println("Language used "+name);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string obj=new string();
        obj.getName("python/java");
	}
}

