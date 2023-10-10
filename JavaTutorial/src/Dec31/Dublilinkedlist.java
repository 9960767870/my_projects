package Dec31;

public class Dublilinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class node<p>
{
	p data;
	node<p> next;
	node<p> prev;
	
	public node(p data) 
	{
		this.data = data;
		this.next = null;
		this.prev = prev;
		
	}
	
}

class Mydublylinkedlist<p>
{
	node<p> head;
	node<p> tail;
	
	void add(p data)
	{
		if(head==null)
		{
		 node<p> obj = new node(data);
			    
			    head=obj;
			    tail=obj;
		}
		else
		{
			node<p> obj = new node(data);
			tail.next=obj;
			obj.prev=tail;
			     tail=obj;
			
		}
		
	}
}
