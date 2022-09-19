package java8;
import java.awt.*;;
public class lambaex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("ActionListener Before Java8");  
        
        Button b=new Button("Click Here");  
        b.setBounds(50,100,80,50);  
   
        b.addActionListener(e -> System.out.println("Hello World!"));
        frame.add(b);
        
        frame.setSize(200,200);  
        frame.setLayout(null);  
        frame.setVisible(true);  
	}

}
