package Linkedlist;

import java.util.Arrays;

public class Assint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mylinkedlist1<Integer> m = new Mylinkedlist1<>();
		
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);

		System.out.println(m);
		
		System.out.println(m.indexof(40));
		
		System.out.println(m.lastindexof(50));
		
		System.out.println(m.contains(40));
		
		System.out.println(m.size());
		
		System.out.println(m.get(4)); 
		
		m.remove(2);
		
		m.set(2, 30);
		
		System.out.println(m);
		
		System.out.println(Arrays.toString(m.toarray()));
	}

}

class Node1<p>
{
	p data;
	Node1<p> next;
	
	public Node1(p data) 
	{
		this.data=data;
		this.next=null;
	}
}

class Mylinkedlist1<p>
{
	Node<p> root;
	
	void add(p data)
	{
		Node<p> obj = new Node<>(data);
	if(root==null)
	{
		  root=obj;
	}
	else
	{
		Node<p> temp = root;
		
		while(temp.next!=null)
		{
			temp = temp.next;
			
		}
		    temp.next=obj;
	}
	}
	
	p get(int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		Node<p> temp = root;
		int index=0;
		
		while(temp!=null)
		{
			if(index==i)
				return temp.data;
			temp = temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	void set(int i, p data)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		Node<p> temp = root;
		int index=0;
		
		while(temp!=null)
		{
			if(index==i)
			{
				temp.data=data;
			    return;
			}
			temp = temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	int size()
	{
		Node<p> temp = root;
		int index=0;
		
		while(temp!=null)
		{
			temp = temp.next;
			index++;
		}
		return index;
	}
	
	int indexof(p data)
	{
		Node<p> temp = root;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
				return index;
			temp = temp.next;
			index++;
		}
		return -1;
	}
	
	int lastindexof(p data)
	{
		Node<p> temp = root;
		int index=0;
		int returnvalue=-1;
		
		while(temp!=null)
		{
			if(temp.data==data)
				returnvalue = index;
			temp = temp.next;
			index++;
		}
		return returnvalue;
	}
	
	boolean contains(p data)
	{
		Node<p> temp = root;
		int index=0;
		
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
			temp = temp.next;
			index++;
		}
		return false;
	}
	
	@Override
	public String toString() 
	{
	
		String s = "[";
		
		Node<p> temp = root;
		
		while(temp!=null)
		{
			s = s+temp.data;
			
			if(temp.next!=null)
			{
				s = s+", ";
			}
			temp = temp.next;
		}
		s = s+"]";
		return s;
	}
	
	
	Object[] toarray()
	{
	Object[] b = new Object[size()];
	
	Node<p> temp = root;
	int index=0;
	
	while(temp!=null)
	{
		      b[index++]=temp.data;
		      temp = temp.next;	      
	}
	return b;
	}
	
	int remove(int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		if(i==0)
		{
			root.next = root;
			return 1;
		}
		
		Node<p> temp = root;
		int index=0;
		
		while(temp!=null)
		{
			if(index==i-1)
			{
				temp.next = temp.next.next;
				return 1;
			}
			temp = temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	
}
