package Linkedlist12;

public class List<p> 
{

	Node<p> root;
	
	void add(p data)
	{
		Node<p> obj = new Node<p>(data);
		
		if(root==null)
			 root=obj;
		
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
		int index = 0;
		
		while(temp!=null)
		{
			if(index==i)
				return temp.data;
			temp = temp.next;
			index++;	
		}
		throw new ArrayIndexOutOfBoundsException();
		
	}
	
	void set(int i,p data)
	{
		
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		Node<p> temp = root;
		int index=0;
		
		while(temp!=null)
		{
			if(index==i)
			{
				temp.data = data;
				return;
			}
			temp = temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
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
		int indexvalue = -1;
		
		while(temp!=null)
		{
			if(temp.data==data)
				
				indexvalue = index;
			temp = temp.next;
			index++;
		}
		return indexvalue;
		
	}
	
	boolean contains(p data)
	{
		Node<p> temp =  root;
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
	
	@Override
	public String toString() 
	{
	
		String s = "[";
		
		Node<p> temp =root;
		int index=0;
		while(temp!=null)
		{
			s=s+temp.data;
			
			if(temp.next!=null)
				s=s+", ";
			temp = temp.next;
			index++;
		}
		s=s+"]";
		return s;
	}
	
	Object[] toarray()
	{
		Object[] b = new Object[size()];
		
		Node<p> temp = root;
		int index = 0;
		
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
			root=root.next;
			return 1;
		}
		
		else
		{
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
	
	void print()
	{
		Node<p> temp = root;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
		
		}
}
