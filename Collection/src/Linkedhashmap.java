
public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		map m = new map();
		
		m.put(10, "rushi");
		m.put(20, "shiva");
		m.put(30, "megha");
		m.put(40, "varad");
		m.put(50, "sachin");
		
		System.out.println(m.get(10));
		m.print();
		
	}

}

class Node1{
	
	int key;
	String value;
	
	Node1 linkednext;
	Node1 hashnext;
	
	public Node1(int key,String value) 
	{
		
		this.key = key;
		this.value = value;
	}
}

class map
{
	Node1 root;
	
	Node1[] a = new Node1[4];
	
	void put(int key,String value)
	{
		Node1 obj = new Node1(key, value);
		
		// add in hashmap
		
		int index = key%a.length;
		
		if(a[index]==null)
		{
			  a[index]=obj;
		}
		else
		{
			Node1 temp = a[index];
			
			while(temp.hashnext!=null)
			{
				temp = temp.hashnext;
			}
			 temp.hashnext = obj;
		}
		
		// add in linkedlist
		
		if(root==null)
		{
			 root=obj;
		}
		
		else
		{
			Node1 temp = root;
			
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
		
		Node1 temp = a[index];
		
		while(temp.hashnext!=null)
		{
			if(temp.key == key)
				return temp.value;
			
			temp = temp.hashnext;
		}
		return null;
	}
	
	void print()
	{
		Node1 temp = root;
		
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			
			temp = temp.linkednext;
		}
	}
}
