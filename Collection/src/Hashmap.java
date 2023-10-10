

public class Hashmap<k,v> 
{


	public static void main(String[] args) {

		list<Integer,String> l = new list<>();
		l.add(110, "rushi");
		l.add(1, "bhosale");
		l.add(2, "varad");
		l.add(3, "sachin");
		l.add(14, "raje");
		l.add(10, "shiva");
		l.add(11, "megha");
		
		System.out.println(l.containsvalue("rushi"));
		
		System.out.println(l.containswith(14));
		
		System.out.println(l.size());
		
		Object s = l.get(11);
		
		System.out.println(s);
		
		System.out.println(l);
		
		
		l.print();

	}

}

class Node<k ,v>
{
	k key;
	v value;
	
	Node<k,v> next;
	
	public Node(k key,v value)
	{
		
		this.key = key;
		this.value = value;
	}
}

class list<k,v>
{
	Node[] a = new Node[5];
	
	void add(k key,v value)
	{
	 int index = a.hashCode()%a.length;
	 
	 if(a[index]==null)
	 {
		 a[index] = new Node<k, v>(key, value);
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
		
		for (int i = 0; i < a.length; i++)
		{
			Node temp = a[i];
		
			while(temp!=null)
			{
				size++;
				temp = temp.next;
			}
		}
		return size;
	}
	
	Object get(k key)
	{
		int index = a.hashCode()%a.length;
		
		Node temp = a[index];
		
		while(temp!=null)
		{
			if(temp.key==key)
				
				return temp.value;
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
				if(temp.value == value)
					return true;
				temp = temp.next;
			}
		}
		return false;
	}
	
	boolean containswith(k key)
	{
		int index = a.hashCode()%a.length;
		
		Node temp = a[index];
		
		while(temp!=null)
		{
			if(temp.key==key)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	@Override
	public String toString() 
	{
	
		String s = "[";
		
		for (int i = 0; i < a.length; i++) 
		{
			
			Node temp = a[i];
			
			while(temp!=null)
			{
				s =s + temp.key+" "+temp.value+" ";
				
				if(temp.next!=null)
					s=s+", ";
				
				temp = temp.next;
			}
			
		}
		s=s+"]";
		return s;
	}
	
	void print()
	{
		
		for (int i = 0; i < a.length; i++) 
		{
			Node temp = a[i];
			
			while(temp!=null)
			{
			System.out.println(temp.key+" "+temp.value);
			temp = temp.next;
			}
		}
	}
}

