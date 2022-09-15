package linkedlist;

 class slist{
	 
    public Node head = null;
 

    class Node {
        private int data;
        private Node next;
 
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
 
 
 public void insertn(int data)
 {
	 Node n = new Node(data);
	 if(this.head==null)
	 {
		 this.head=n;
	 }
	 else
	 {
		 n.next=this.head;
		 this.head=n;
	 }
 }
 public void insertend(int data)
 {
	 Node n = new Node(data);
	 if(this.head==null)
	 {
		 this.head=n;
	 }
	 else
	 {
		 Node t=this.head;
		 while(t.next!=null)
			 t=t.next;
		 t.next=n;
	 }
 }
 
 public void insertsp(int data,int pos)
 {
	 Node n = new Node(data);
	 if(pos==1)
	 {
		 insertn(data);
	 }
	 else
	 {	
		 Node t=this.head;
		 Node l=t.next;
		 for(int i=0;i<pos-2;i++)
		 {
			 t=t.next;
			 l=l.next;
		 }
		 t.next=n;
		 n.next=l;
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

public class linkedlist {

	public static void main(String[] args) {
		
		slist s=new slist();
		s.insertn(1);
		s.insertend(0);
		s.insertn(5);
		s.insertsp(6, 2);
		s.display();
	}

}
