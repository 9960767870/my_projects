

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
		
	Map m =new Map();
	m.add(2, "Sachin");
	m.add(4, "varad");
	m.add(5, "raje");
	m.add(1, "Rushi");
	m.add(3, "megha");
	
	m.print();
	
	System.out.println(m.get(1));
	
		
		
	}

}

class Node
{

int key;
 String value;
 Node left;
 Node rigth;
 
 public Node(int key,String value) {
	
	 this.key = key;
	 this.value = value;
	 this.left = null;
	 this.rigth = null;
}
}
 
 class Map
 {
	 Node root;
	 
	 void add(int key,String value)
	 {
		 if(root==null)
		 root = new Node(key, value);
		 
		 else
		 {
			 Node temp = root;
			 
			 while(true)
			 {
				 if(temp.key==key)
				 {
					 temp.value=value;
					 return;
				 }
				 
				 else if(key<temp.key && temp.left==null)
				 {
					 temp.left = new Node(key, value);
					 return;
				 }
				 
				 else if(key>temp.key && temp.rigth==null)
				 {
					 temp.rigth = new Node(key, value);
					 return;
				 }
				 
				 else if(key<temp.key && temp.left!=null)
				 {
					 temp = temp.left;
					 
				 }
				 else if(key>temp.key && temp.rigth!=null)
				 {
					 temp = temp.rigth;
					 
				 }
				 
			 }
		 }
	 }
	 
	 String get(int key)
	 {
		 Node temp = root;
		 
		 if(root==null)
		 {
			 return null;
		 }
		 else
		 {
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
			 else if(key>temp.key && temp.rigth==null)
			 {
				 return null;
			 }
			 else if(key<temp.key && temp.left!=null)
			 {
				 temp = temp.left;
			 }
			 else if(key>temp.key && temp.rigth!=null)
			 {
				 temp = temp.rigth;
			 }
			 
			 }	 
		 }
		
		 
	 }
	 
	 void printtree(Node temp)
	 {
		 if(temp.left!=null)
			 printtree(temp.left);
		 
		 System.out.println(temp.key+" "+temp.value);
		 
		 if(temp.rigth!=null)
			 printtree(temp.rigth);
	 }
	 
	 void print()
	 {
		 printtree(root);
	 }
	 
	
 }
 

