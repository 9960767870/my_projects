package Linkedhashmap2;

public class Linkedhashmap 
{

	Node root;
	
	Node[] a = new Node[4];
	
	void put(int key, String value)
	{
		Node obj = new Node(key, value);
		
		//add in hashmap
		
		int index = key%a.length;
		
		if(a[index]==null)
		{
			   a[index]=obj;
		}
		
		else
		{
			Node temp = root;
			
			while(temp.hashmapnext!=null)
			{
				temp = temp.hashmapnext;
			}
			temp.hashmapnext = obj;
		}
		
		// add in linkedlist
		
		if(root==null)
		{
			  root= obj;
		}
		else
		{
			Node temp = root;
			
			while(temp.linkednext!=null)
			{
				temp = temp.linkednext;
				
			}
			
			temp.linkednext = obj;
		}
	}
	
	String get(int key)
	{
		int index = key%a.length;
		
		Node temp = a[index];
		
		while(temp.hashmapnext!=null)
		{
			if(temp.key == key)
				return temp.value;
			temp = temp.hashmapnext;
			
		}
		return null;
		
	}
	
	void print()
	{
		Node temp = root;
		
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			
			temp = temp.linkednext;
		}
	}
	
	
}
