package LinkedHashMap;

public class Node<d1,d2> 
{

	d1 key;
	d2 value;
	
	Node<d1, d2> linkednext;
	Node< d1, d2> hashtablenext;
	
	public Node(d1 key,d2 value) {
		
		this.key=key;
		this.value=value;
	}
}
