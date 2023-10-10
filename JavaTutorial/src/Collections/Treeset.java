package Collections;

public class Treeset {

	public static void main(String[] args) {
	
		Mytree m = new Mytree();
		m.add(50);
		m.add(30);
		m.add(60);
		m.add(40);
		m.add(20);
		m.add(10);
		m.print();

	}

}

class Node1
{
	int data;
	Node1 left;
	Node1 right;
	
	public Node1(int data) 
	{
		this.data = data;
		this.left=null;
		this.right=null;
	}
}

class Mytree
{
	Node1 root;
	
	public void add(int data)
	{
		if(root==null)
			root = new Node1(data);
		else
		{
			Node1 temp = root;
			
			while(true)
			{
				if(data==temp.data)
					return;
				else if(data<temp.data && temp.left==null)
				{
					temp.left=new Node1(data);
					return;
				}
				else if(data>temp.data && temp.right==null)
				{
					temp.right=new Node1(data);
					return;
				}
				
				else if(data<temp.data && temp.left!=null)
					temp=temp.left;
				else if(data>temp.data && temp.right!=null)
					temp=temp.right;
				
			}
		}
		
	}
	
	void printmynode(Node1 temp)
	{
		if(temp.left!=null)
		printmynode(temp.left);
		
		System.out.println(temp.data);
		
		if(temp.right!=null)
			printmynode(temp.right);
	}
	
	void print()
	{
		printmynode(root);
	}
	
}


