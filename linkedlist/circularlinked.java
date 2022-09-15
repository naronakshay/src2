package linkedlist;

import linkedlist.dlist.Node;

class clist{
	 
    public Node head = null;
    public Node tail = null;
 

    class Node {
        private int data;
        private Node next;
        
 
        public Node(int data) {
            this.data = data;
            this.next = null;
          
        }
    }
    public void addn(int value)
    {
    	Node n = new Node(value);
    	if(head==null)

    {
    		head=n;
    }
    	else
    	{
    		tail.next=n;
    	}
    	tail=n;
    	n.next=head;
    }
    
    public void display()
    {
   	 Node t=this.head;
   	 while(t.next !=head)
   	 {
   		 System.out.print(t.data);
   		 t=t.next;
   	 }
   	 System.out.print(t.data);
    }
}
public class circularlinked {

	public static void main(String[] args) {
		clist c=new clist();
		c.addn(4);
		c.addn(8);
		c.display();

	}

}
