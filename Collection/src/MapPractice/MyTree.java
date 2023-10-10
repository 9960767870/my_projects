package MapPractice;

public class MyTree 
{

	Node root;
	
	void add(int key,String value)
	{
			if(root==null)
			{
				root = new Node(key, value);
			}
			
			else
			{
				Node temp = root;
				
				while(true)
				{
					if(temp.key==key)
					{
						temp.value=value;
					}
					
					else if(key<temp.key && temp.left==null)
					{
						temp.left=new Node(key, value);
						return;
					}
					
					else if(key>temp.key && temp.right==null)
					{
						temp.right = new Node(key, value);
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
					temp = temp.right;
			}
		}
	}
	
	void printTree(Node temp)
	{
		if(temp.left!=null)
			printTree(temp.left);
		
		System.out.println(temp.key+" "+temp.value);
		
		if(temp.right!=null)
			printTree(temp.right);
	}
	
	void print()
	{
		printTree(root);
	}
}
