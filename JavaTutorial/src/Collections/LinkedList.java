package Collections;

import java.util.Arrays;

public class LinkedList {

	public static void main(String[] args) {
		
		Mylinkedlist<Integer> list = new Mylinkedlist<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		System.out.println();
		System.out.println(list.contains(20));
		System.out.println();
		System.out.println(list.indexof(50));
		System.out.println();
		System.out.println(list.lastindexof(40));
		System.out.println();
		System.out.println(list.size());
		System.out.println();
		list.set(2, 25);
		 System.out.println();
		System.out.println(list.get(2));
		System.out.println();
		System.out.println(list.remove(2));
		
		System.out.println(Arrays.toString(list.toArray()));
		list.print();
		
	}

}

class Node<p>
{
	p data;
	Node<p> next;
	
	public Node(p data) 
	{
		this.data = data;
		next = null;
	}
}

class Mylinkedlist<p>
{
	Node<p> root;

	public void add(p data)
	{
		Node<p> obj = new Node<p>(data);
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
	
	
	boolean contains(p data)
	{	
		Node<p> temp = root;
		
		while(temp!=null)
		{
			if(temp.data==data)
		
				return true;
				
				temp = temp.next;
		}
		return false;
	}
	
	int indexof(p data)
	{
		int index = 0;
        Node<p> temp = root;
		
		while(temp!=null)
		{
			if(temp.data==data)
		
				return index;
				
				temp = temp.next;
				index++;
		}
		return -1;	
	}
	
	
	
	public String toString() 
	{
		String s = "[";
		Node<p> temp = root;
		
		while(temp!=null)
		{
			s = s+temp.data;
			
			if(temp.next!=null)
			{
				s=s+", ";
			}
			temp=temp.next;
			
		}
		s=s+"]";
		return s;
		
	}
	
	
	int lastindexof(p data)
	{
		int returnvalue = -1;
		int index = 0;
		Node<p> temp = root;
		
		while(temp!=null)
		{
			if(temp.data==data)
			
				returnvalue = index;
				temp = temp.next;
				index++;
						
		}
		return returnvalue;
	}
	
	p get(int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		Node<p> temp = root;
		int index = 0;
		while(temp!=null)
		{
			if(index==i)
			{
				return temp.data;
			}
			temp = temp.next;
			index++;
		}
		
		// if not found in list
		throw new ArrayIndexOutOfBoundsException();
	}
	
	int size()
	{
		int index = 0;
		Node<p> temp = root;
		
		while(temp!=null)
		{
			temp = temp.next;
			index++;
		}
		return index;
	}
	
	int remove(int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		if(i==0)
		{
			root = root.next;
			return 1;
		}
		
		//try to remove
		
		Node<p> temp = root;
		int index = 0;
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
		//else exception
		throw new ArrayIndexOutOfBoundsException();
	}
	
	
	void set(int i,p data)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		Node<p> temp = root;
		int index = 0;
		
		while(temp!=null)
		{
			if(index==i)
			{
				temp.data=data;
				return;
			}
			temp=temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	Object[] toArray()
	{
		Object[] a = new Object[size()];
		Node<p> temp = root;
		int index = 0;
		while(temp!=null)
		{
			a[index]=temp.data;
			temp=temp.next;
			index++;
		}
		return a;
	}
	
	void addwith(int i,p data)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		if(i==0)
		{
			Node<p> obj = new Node<p>(data);
			obj.next=root;
			root=obj;
			return;
		}
		Node<p> temp = root;
		int index = 0;
		while(temp!=null)
		{
			if(index==i-1)
			{
				Node<p> obj = new Node(data);
				obj.next = temp.next;
				temp.next = obj;
				return;
			}
			temp = temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
			
	}
	
	public void print()
	{
		Node<p> temp=root;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
}
