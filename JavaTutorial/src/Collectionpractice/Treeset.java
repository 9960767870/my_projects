package Collectionpractice;

public class Treeset {

	public static void main(String[] args) {
	
		Mytree m = new Mytree();
		m.add(30);
		m.add(20);
		m.add(40);
		m.add(10);
		m.add(50);
		m.print();

	}

}

class node
{
	int data;
	node left;
	node right;
	
	public node(int data) 
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class Mytree
{
	node root;
	
	void add(int data)
	{
		if(root==null)
		root=new node(data);
		else
		{
			node temp = root;
			
			while(true)
			{
				if(data==temp.data)
					return;
				else if(data<temp.data && temp.left==null)
				{
					 temp.left=new node(data);
					 return;
				}
				else if(data>temp.data && temp.right==null)
				{
					temp.right=new node(data);
					return;
				}
				else if(data<temp.data && temp.left!=null)
					temp=temp.left;
				else if(data>temp.data && temp.right!=null)
					temp=temp.right;
					
			}
		}
		
		
	}
	
	void printmytree(node temp)
	{
		if(temp.left!=null)
		printmytree(temp.left);
		
		System.out.println(temp.data);
		
		if(temp.right!=null)
		printmytree(temp.right);
		
	}
	
	void print()
	{
		printmytree(root);
	}
}
