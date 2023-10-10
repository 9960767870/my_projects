package Coolectionpracticeset1;

public class Linkedlist {

	public static void main(String[] args) {
		
		Mylinkedlist<Integer> m = new Mylinkedlist();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.print();
		
		System.out.println(m.indexof(40));
		System.out.println(m.lastindexof(50));
		
	
	}

}

class node<p>
{
	p data;
	node<p> next;
	
	public node(p data) 
	{
		this.data=data;
		this.next=null;
		
	}
}

class Mylinkedlist<p>
{
	node<p> root;
	
	void add(p data)
	{
		node<p> obj = new node<>(data);
		
		if(root==null)
		{
			  root=obj;
		}
		else
		{
			node<p> temp = root;
			
			while(temp.next!=null)
			{
				  temp=temp.next;
			}
			      temp.next=obj;
		}
		
	}
	
	
	boolean contains(p data)
	{
		node<p> temp = root;
		
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
		}
		return false;
	}
	
	int indexof(p data)
	{
		int index=0;
		node<p> temp = root;
		while(temp!=null)
		{
			if(temp.data==data)
				return index;
			temp=temp.next;
			index++;
		}
		return -1;
	}
	
	int lastindexof(p data)
	{
		int index=0;
		int returnvalue=-1;
		node<p> temp = root;
		
		while(temp!=null)
		{
			if(temp.data==data)
			returnvalue =index;
			
			temp = temp.next;
			index++;
		}
		return returnvalue;
	}
	
	p get(int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		node<p> temp = root;
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
		throw new ArrayIndexOutOfBoundsException();
	}
	
	void set(int i,p data)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		node<p> temp = root;
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
	

	public String toString() 
	{
        
		String s = "[";
		node<p> temp = root;
		
		while(temp!=null)
		{
			s =s+temp.data;
			
			if(temp.next!=null)
			{
				s=s+", ";
			}
			temp=temp.next;
		}
		s=s+"]";
		return s;
	}
	
	int size()
	{
		node<p> temp = root;
		int index=0;
		
		
		while(temp!=null)
		{
			temp = temp.next;
			index++;
		}
		return index;
	}
	
	Object[] toarray()
	{
	Object[] b = new Object[size()];
	node<p> temp = root;
	int index=0;
	
	while(temp!=null)
	{
		 b[index++]=temp.data; 
		  temp= temp.next;   
	}
	return b;
	}
	
	void print()
	{
		node<p> temp = root;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println();
	}
	
	
}
