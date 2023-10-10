package DublyLinkedListPractice;

public class Addmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myclass<Integer> m = new Myclass<>();
		
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.frdprint();
		m.revprint();
	}

}

class Node<p>
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

class Myclass<p>
{
	private Node<p> head;
	private Node<p> tail;
	
	void add(p data)
	{
		if(head==null)
		{
			Node<p> n = new Node(data);
			         head=n;
			         tail=n;
		}
		else
		{
			Node<p> n = new Node(data);
			
			      tail.next =n;
			      n.prev = tail;
			         tail=n;
		}
	}
	
	void revprint()
	{
		Node<p> temp = tail;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		System.out.println();
	}
	
	void frdprint()
	{
		Node<p> temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
}
