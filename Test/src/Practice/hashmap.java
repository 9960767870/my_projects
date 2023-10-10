package Practice;

public class hashmap {

	public static void main(String[] args) {
	
		Map<Integer ,String> m = new Map<Integer,String>();
		
		m.add(2, "sachin");
		m.add(3, "varad");
		m.add(5, "raje");
		m.add(4, "krushna");
		m.add(1, "rushi");
		m.add(6, "don");
		
		m.print();
		
		System.out.println(m.size());
		
		System.out.println(m.get(1));
		
		System.out.println(m.containskey(1));
		
		System.out.println(m.containsvalue("rushi"));
		
		System.out.println(m);

	}

}

class Node<k,v>
{
	k key;
	v value;
	Node<k,v> next;
	
	public Node(k key,v value) 
	{
		this.key = key;
		this.value = value;
		
	}
}

class Map<k,v>
{
	  Node[] a = new Node[5];
	  
	  void add(k key,v value)
	  {
		  int index = key.hashCode()%a.length;
		  
		  if(a[index]==null)
		  {
			  a[index] = new Node(key, value);
		  return;
		  }
		  
		  Node temp = a[index];
		  
		  while(temp.next!=null)
		  {
			  
			  temp = temp.next;
		  }
		  temp.next = new Node(key, value);
	  }
	  
	  int size()
	  {
		  int size=0;
		  
		  for (int i = 0; i < a.length; i++)
		  {
			
			  Node temp = a[i];
			  
			  while(temp!=null)
			  {
				  size++;
				  temp = temp.next;
			  }
		}
		  return size;
	  }
	  
	  Object get(k key)
	  {
		  int index = key.hashCode()%a.length;
		  
		  Node temp = a[index];
		  
		  while(temp!=null)
		  {
			  if(temp.key==key)
				  return temp.value;
			  temp = temp.next;
			  
		  }
		  return null;
	  }
	  
	  boolean containsvalue(v value)
	  {
		  for (int i = 0; i < a.length; i++) 
		  {
			  Node temp = a[i];
			  
			  while(temp!=null)
			  {
				  if(temp.value==value)
					  return true;
				  temp = temp.next;
			  }
			
		}
		  return false;
	  }
	  
	  boolean containskey(k key)
	  {
		  int index = key.hashCode()%a.length;
		  
		  Node temp = a[index];
		  
		  while(temp!=null)
		  {
			  if(temp.key==key)
				  return true;
			  temp = temp.next;
		  }
		  return false;
	  }
	  
	  @Override
	public String toString() 
	{
		  String s = "[";
		  for (int i = 0; i < a.length; i++) 
		  {
			Node temp = a[i];
			
			while(temp!=null)
			{
			
				s = s+temp.key+" ,"+temp.value+" ";
				
				if(temp.next!=null)
				
					s=s+", ";
				
				
				temp = temp.next;
			}
		}
		  s =s+"]";
		  return s;
		
	}
	  
	  void print()
	  {
		  for (int i = 0; i < a.length; i++) {
			Node temp = a[i];
			
			while(temp!=null)
			{
				System.out.println(temp.key+" "+temp.value);
				temp = temp.next;
			}
		}
	  }
}
