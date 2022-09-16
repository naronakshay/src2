
package eventhandling;
 import java.awt.*;

 import java.awt.event.*;
 
 class event extends Frame implements ActionListener{
	 TextField t;
	 event()
	 {
		 t= new TextField();
		 Button b= new Button("CLICK HERE");
		 t.setBounds(60,50,170,20);
		 b.setBounds(100,120,80,30);
		 b.addActionListener(this);
		 add(b);add(t);
		 setSize(300,300);
		 setLayout(null);
		 setVisible(true);
		 	 
	 }
	public void actionPerformed(ActionEvent e) {
		 t.setText("WELCOME");
	}
	public static void main(String[] args) {
		new  event();

	}
	}

