package Treemap;

public class Map 
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
        			 temp.value = value;
        			 return;
        		 }
        		 
        		 else if(key<temp.key && temp.left==null)
        		 {
        			 temp.left =new Node(key, value);
        			 return;
        		 }
        		 else if(key>temp.key && temp.right==null)
        		 {
        			 temp.right = new Node(key, value);
        			 return;
        		 }
        		 
        		 else if(key<temp.key && temp.left!=null)
        		 {
        			 temp = temp.left;
        			 return;
        		 }
        		 
        		 else if(key>temp.key && temp.right!=null)
        		 {
        			 temp = temp.right;
        			 return;
        		 }
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
				{
					temp =  temp.left;
				}
				else if(key<temp.key && temp.right!=null)
				{
					temp =  temp.right;
				}
			}
		}
	}
}
