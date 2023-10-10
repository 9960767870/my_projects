package LinkedHashMap;

import com.sun.javafx.css.StyleCacheEntry.Key;

public class Mylinkedhashmap<d1,d2> {

	
	Object[] a = new Object[16];
	
	Node<d1,d2> root;
	
	void add(d1 key,d2 value)
	{
		
		Node<d1, d2> obj = new Node<d1,d2>(key, value);
		
		addLinkedlist(obj);
		addHashtable(obj);
	}

	private void addHashtable(Node<d1, d2> obj) {
		
		int index = obj.key.hashCode()%a.length;
		
		Node<d1, d2> root = (Node<d1, d2>) a[index];
		
		if(root==null)
		{
			root=obj;
		}
		else
		{
			Node<d1, d2> temp = root;
			
			while(temp.hashtablenext!=null)
			{
				temp = temp.hashtablenext;
			}
			temp.hashtablenext = obj;
		}
		
	}

	private void addLinkedlist(Node<d1, d2> obj) {
		if(root==null)
		{
			root=obj;
		}
		else
		{
			Node<d1, d2> temp = root;
			
			while(temp.linkednext!=null)
			{
				
				temp = temp.linkednext;
			}
			
			temp.linkednext = obj;
		}
		
	}
	
	public d2 get(d1 key)
	{
		int index = key.hashCode()%a.length;
		Node<d1, d2> temp = (Node<d1, d2>) a[index];
		
		while(temp!=null)
		{
			if(temp.key==key)
			
				return temp.value;
			
			
			temp = temp.hashtablenext;
		}
		return null;
	}
	
	public int size()
	{
		Node<d1, d2> temp = root;
		int count=0;
		
		while(temp!=null)
		{
			count++;
			temp=temp.linkednext;
		}
		return count;
		
	}
	
	
	public boolean containsvalue(d2 value)
	{
		Node<d1, d2> temp = root;
		
		while(temp!=null)
		{
			if(temp.value==value)
				return true;
			
			temp=temp.linkednext;
		}
		return false;
	}
	
	public d2 replace(d1 key,d2 newvalue)
	{
		int index=key.hashCode()%a.length;
		Node<d1, d2> temp = (Node<d1, d2>) a[index];
		
		while(temp!=null)
		{
			if(temp.key==key)
			{
				d2 oldvalue = temp.value;
				temp.value=newvalue;
				return oldvalue;
			}
			temp = temp.hashtablenext;
		}
		return null;
		
	}
	
	public String toString()
	{
		String s = "[";
		
		Node<d1, d2> temp = root;
		
		while(temp!=null)
		{
			s=s+temp.key+temp.value;
			
			if(temp.linkednext!=null)
				s=s+", ";
			
			temp=temp.linkednext;
		}
		s=s+"]";
		return s;
	}
	
	void print()
	{
		Node<d1, d2> temp =root;
		
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			
			temp = temp.linkednext;
		}
	}
}
