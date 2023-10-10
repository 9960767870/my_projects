package Hashmap2;

public class List<k,v> 
{

	Node[] a = new Node[5];
	
	void add(k key,v value)
	{
		
		int index = a.hashCode()%a.length;
		
		if(a[index]==null)
		{
			a[index]=new Node<k, v>(key, value);
			return;
		}
		
		Node temp = a[index];
		
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		
		temp.next = new Node<k, v>(key, value);
 	}
	
	int size()
	{
		int size = 0;
		for (int i = 0; i < a.length; i++) {
			
			Node temp = a[i];
			
			while(temp!=null)
			{
				size++;
				temp = temp.next;
						
			}
			
		}
		return size;
	}
	
	
	v get(k key)
	{
		int index = a.hashCode()%a.length;
		
		Node temp = a[index];
		
		while(temp!=null)
		{
			if(temp.key==key)
				return (v)temp.value;
			temp = temp.next;
		}
		return null;
		
		
	}
	
	boolean containsvalue(v value)
	{
		for (int i = 0; i < a.length; i++) {
			
			Node temp = a[i];
			while(temp!=null)
			{
				if(temp.value==value)
					return true;
				temp = temp.next;
					
			}
			
		}
		return false;
	}
	
	boolean contains(k kay)
	{
		int index = a.hashCode()%a.length;
		
		Node temp = a[index];
		
		while(temp!=null)
		{
			if(temp.key==kay)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	void print()
	{
		for (int i = 0; i < a.length; i++) {
			
			Node temp = a[i];
			
			while(temp!=null)
			{
			System.out.println(temp.key+" "+temp.value);
			
			temp = temp.next;
			}
		}
	}
	
	@Override
	public String toString() 
	{
	 
		String s = "[";
		
		for (int i = 0; i < a.length; i++) {
		
			Node temp = a[i];
			
			while(temp!=null)
			{
				s =s+temp.key+temp.value+" ";
				
				if(temp.next!=null)
			
					s=s+", ";
				
				temp = temp.next;
			}
		}
		
		s = s+"]";
		return s;
	}
}
