package Dec31;



public class Treemap {

	public static void main(String[] args) {
		
		Map m = new Map();
		m.add(4, "bablya");
		m.add(2, "sachin");
		m.add(3, "varad");
		m.add(1, "rushi");
		m.add(5, "shiva");
		m.add(6, "megha");
		m.add(4,"don");
		
		String s = m.get(1);
		System.out.println(s);
		m.print();

	}

}
class node1
{
	int key;
	String value;
	node1  left;
	node1  right;
	
	public node1(int key , String value) 
	{
	  this.key = key;
	  this.value = value;
	  this.left = null;
	  this.right = null;
		
	}
}

class Map
{
	node1 root;
	
	void add(int key , String value)
	{
		if(root==null)
		{
			root=new node1(key, value);
		}
		
		else
		{
			node1 temp = root;
			
			while(true)
			{
				if(temp.key==key)
				{
					temp.value=value;
					return;
				}
				else if(key<temp.key && temp.left==null)
				{
					temp.left = new node1(key, value);
					return;
				}
				else if(key>temp.key && temp.right==null)
				{
				    temp.right = new node1(key, value);	
				    return;
				}
				
				else if(key<temp.key && temp.left!=null)
					temp=temp.left;
				
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
			}
		}
	}
	
	
	
	String get(int key)
	{
		if(root==null)
			return null;
		
		else
		{
			node1 temp=root;
			
			while(true)
			{
				if(temp.key==key)
				{
					return temp.value;
				}
				
				else if(key<temp.key && temp.left==null)
				{
					return null;
				}
				
				else if(key>temp.key && temp.right==null)
				{
					return null;
				}
				
				else if(key<temp.key && temp.left!=null)
					temp=temp.left;
					
				else if(key>temp.key && temp.right!=null)
					temp = temp.right;
			}
		}
	}
	
	void printnode(node1 temp)
	{
		if(temp.left!=null)
			printnode(temp.left);
		
		System.out.println(temp.key+" "+temp.value);
		
		if(temp.right!=null)
			printnode(temp.right);
	}
	
	void print ()
	{
		printnode(root);
	}
	
}