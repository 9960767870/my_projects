package Treemap;

public class Mytreemap 
{

	Node root;
	
	void add(int key , String value)
	{
		if(root==null)
		{
			root=new Node(key, value);
		}
		else 
		{
			Node temp = root;
			
			while(true)
			{
				if(temp.key==key)
				{
					temp.value = value;
				}
				else if(key<temp.key && temp.left==null)
				{
					temp.left = new Node(key, value);
					return;
				}
				
				else if(key>temp.key  && temp.right==null)
				{
					temp.right = new Node(key, value);
					return;
				}
				
				else if(key<temp.key && temp.left!=null)
					      temp=temp.left;
				
				else if(key>temp.key && temp.right!=null)
					       temp = temp.right;
			    }
			
		}
	}
	
	String get(int key)
	{
		if(root==null)
		{
			return null;
		}
		
		else
		{
			Node temp = root;
			
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
					temp = temp.left;
				
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
			}
		}
	}
	
	@Override
	public String toString() 
	{
		
		String s = "[";
		
		Node temp = root;
		
		while(temp!=null)
		{
			s = s+temp.key+temp.value;
			
			if(temp.toString()!=null)
			{
				s=s+", ";
			}
		
		}
		s=s+"]";
		return s;
	}
	
	void printtree(Node temp)
	{
		if(temp.left!=null)
			printtree(temp.left);
		
		System.out.println(temp.key+" "+temp.value);
		
		if(temp.right!=null)
			printtree(temp.right);
	}
	
	void print()
	{
		printtree(root);
	}
	
	
}
