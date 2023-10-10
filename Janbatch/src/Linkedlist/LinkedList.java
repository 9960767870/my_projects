package Linkedlist;

public class LinkedList {

	public static void main(String[] args) {
		
		Mylinkedlist list = new Mylinkedlist();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//list.print();
		System.out.println(list);
		System.out.println(list.mycontains(20));
		System.out.println(list.indexof(20));
		System.out.println(list.lastindexof(50));
	}
}

class Node
{
	int data;
	
	Node next;

	public Node(int data) {
		super();
		this.data = data;
		
	}
	
	
}

class Mylinkedlist
{
	Node head;
	
	
	void add(int data)
	{
		if(head==null)
		{
			head = new Node(data);
		}
		else
		{
			Node temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
		}
	}
	public boolean mycontains(int data)
	{
		
		Node temp = head;
		
		while(temp!=null)
		{
			if(temp.data==data)
			 return true;
				temp=temp.next;
			
		}
		return false;
	}
	
	int indexof(int data)
	{
	int index=0;
	
	Node temp=head;
	
	while(temp!=null)
	{
		if(temp.data==data)
			return index;
		
		temp=temp.next;
		index++;
	}
	return -1;
	}
	
	int lastindexof(int data)
	{
		Node temp=head;
		int index=0;
		int returnvalue=-1;
		
		while(temp!=null)
		{
			if(temp.data==data)
				returnvalue = index;
			temp=temp.next;
			index++;
		}
		return returnvalue;
	}
	
	
	
	public String toString()
	{
		String s = "[";
		
		    Node temp=head;
		    while(temp!=null)
		    {
		    	if(temp.next!=null)
		    	{
		    	s=s+temp.data+", ";
		    	}
		    	else
		    		s=s+temp.data;
		    	temp=temp.next;
		   	
		    }
		    s=s+"]";
		return s;
	}
	
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}
}
