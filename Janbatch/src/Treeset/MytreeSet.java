package Treeset;

public class MytreeSet {

	Node root;
	
	void add(int data)
	{
	if(root==null)
	{
		root = new Node(data);
	}
	else
	{
		Node temp=root;
		
		while(true)
		{
			if(data<temp.data && temp.left==null)
			{
				temp.left = new Node(data);
				return;
			}
			else if(data<temp.data && temp.left!=null)
			{
				temp=temp.left;
			}
			else if(data>temp.data && temp.rigth==null)
			{
				temp.rigth=new Node(data);
				return;
			}
			else if(data>temp.data && temp.rigth!=null)
			{
				temp = temp.rigth;
			}
		}
	}
}
	
	void print()
	{
		Node temp=root;
		printmynode(root);
	}
	void printmynode(Node temp)
	{
		if(temp.left!=null)
			printmynode(temp.left);
		System.out.println(temp.data);
		
		if(temp.rigth!=null)
			printmynode(temp.rigth);
	}
	
	
}
