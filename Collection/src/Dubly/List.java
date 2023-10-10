package Dubly;

import DubliLinkedlist.Node;

public class List<p> 
{
	Node<p> head;
	   Node<p> tail;
	   
	   void add(p data)
	   {
		   if(head==null)
		   {
			   Node<p> obj = new Node<p>(data);
			   
			   head=obj;
			     tail  =obj;
		   }
		   
		   else
		   {
			   Node<p> obj = new Node<p>(data);
			   
			   tail.next = obj;
			   obj.prev = tail;
			     tail=obj;
			   
		   }
	   }
	
	   void addwith(int i ,p data)
	   {
		   if(i<0)
			   throw new ArrayIndexOutOfBoundsException();
		   
		   if(i==0)
		   {
			   Node<p> obj = new Node<p>(data);
			   obj.next = head;
			   head.prev = obj;
			   head = obj;
		   }
		   
		   Node<p> temp = head;
		   int index = 0;
		   
		   while(temp!=null)
		   {
			   if(index==-1)
			   {
				   if(temp.next==null)
					   throw new ArrayIndexOutOfBoundsException();
				   
				   Node<p> obj = new Node<p>(data);
				   temp.next.prev = obj;
				   obj.next= temp.next;
				     obj.prev = temp;
				            temp.next=obj;
				            return;
			   }
			   temp = temp.next;
			   index++;
		   }
	   }
	void print()
	{
	Node<p> temp = head;
	
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp = temp.next;
	}
	System.out.println();
	}
}
