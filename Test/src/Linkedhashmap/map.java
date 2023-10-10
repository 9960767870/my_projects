package Linkedhashmap;


public class map 
{

	node root;
	node[] a = new node[5];
	
	void put(int key,String value)
	{
		//create object
		
		node obj = new node(key, value);
		
		//create hashmap
		
		int index = key%a.length;
		
		if(a[index]==null)
		{
			   a[index]=obj;
		}
		else
		{
		node temp = a[index];
		
		while(temp.hashnext!=null)
		{
			temp = temp.hashnext;
		}
		temp.hashnext = new node(key, value);
		}
		
		//create linkedlist
		
		if(root==null)
		{
			 root=obj;
		}
		else
		{
			node temp = root;
			
			while(temp.linkednext!=null)
			{
				temp = temp.linkednext;
			}
			temp.linkednext = new node(key, value);
		}
		
		
	}
	
	String get(int key)
	{
		int index = key%a.length;
		
		node temp = a[index];
		
		while(temp.hashnext!=null)
		{
			if(temp.key==key)
				return temp.value;
			
			temp = temp.hashnext;
		}
		return null;
	}
	
	void print()
	{
		node temp = root;
		
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp = temp.linkednext;
		}
	}
}
