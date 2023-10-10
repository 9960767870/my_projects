package DubliLinkedlist;

public class Node<p> 
{
     public p data;
     public Node<p> next;
     public Node<p> prev;
     
     public Node(p data) 
     {
    	 this.data = data;
    	 this.next = null;
    	 this.prev = null;
		
	}
}
