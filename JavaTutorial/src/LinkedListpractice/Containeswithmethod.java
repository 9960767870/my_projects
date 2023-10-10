package LinkedListpractice;

public class Containeswithmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node<p>
{
	p data;
	Node<p> next;
	public Node(p data) 
	{
		this.data = data;
		next=null;
		
	}
}

class Mylinkedlist<p>
{
	Node<p> root;
	
	void add(p data)
	{
		Node<p> obj = new Node(data);
 		if(root==null)
		{
			  root=obj;
		}
 		else
 		{
 			Node<p> temp = root;
 			
 			while(temp.next!=null)
 			{
 				   temp=temp.next;
 			}
 			    temp.next=obj;
 		}
	}
	
	boolean contains(p data)
	{
		Node<p> temp = root;
		
		while(temp!=null)
		{
			if(temp.data==data)
			
				return true;
			     temp=temp.next;
		}
		return false;
	}
}