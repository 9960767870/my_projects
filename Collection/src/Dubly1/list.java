package Dubly1;

public class list<p> 
{

	Node<p> head;
	Node<p> tail;
	
	void add(p data)
	{
		
		if(head==null)
		{
			Node<p> obj = new Node<p>(data);
			head=obj;
			tail=obj;
		}
		
		else
		{
			Node<p> obj = new  Node<p>(data);
			
			tail.next = obj;
			obj.prev = tail;
			tail = obj;
				
		}
	}
}
