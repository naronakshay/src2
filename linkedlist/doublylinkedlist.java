package linkedlist;

import linkedlist.slist.Node;

class dlist{
	 
    public Node head = null;
    public Node tail = null;
 

    class Node {
        private int data;
        private Node next;
        private Node prev;
        
 
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public void insertn(int data)
    {
   	 Node n = new Node(data);
   	 if(this.head==null && this.tail==null)
   	 {
   		 this.head=n;
   		 this.tail=n;
   	 }
   	 else
   	 {
   		 n.next=this.head;
   		 this.head.prev=n;
   		 this.head=n;
   	 }
    }
    
    public void display()
    {
   	 Node t=this.head;
   	 while(t.next !=null)
   	 {
   		 System.out.print(t.data);
   		 t=t.next;
   	 }
   	 System.out.print(t.data);
    }
}  
    

public class doublylinkedlist {

	public static void main(String[] args) {
		dlist d=new dlist();
		d.insertn(2);
		d.insertn(5);
		d.display();

	}

}
