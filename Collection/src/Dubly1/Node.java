package Dubly1;

public class Node<p> 
{
	p data;
	Node<p> next;
	Node<p> prev;
	
	public Node(p data) 
	{
	
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
