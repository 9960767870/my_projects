package DubliLinkedlist;

public class Dubli<p> 
{
   Node<p> head;
   Node<p> tail;
   
   void add(p data)
   {
	   if(head==null)
	   {
		   Node<p> obj = new Node<p>(data);
		   
		   head=obj;
		     tail  =obj;
	   }
	   
	   else
	   {
		   Node<p> obj = new Node<p>(data);
		   
		   tail.next = obj;
		   obj.prev = tail;
		     tail=obj;
		   
	   }
   }
   
   void addwith(int i ,p data)
   {
	   if(i<0)
		   throw new ArrayIndexOutOfBoundsException();
	   
	   if(i==0)
	   {
		   Node<p> obj = new Node<p>(data);
		   obj.next = head;
		   head.prev = obj;
		   head = obj;
	   }
	   
	   Node<p> temp = head;
	   int index = 0;
	   
	   while(temp!=null)
	   {
		   if(index==-1)
		   {
			   if(temp.next==null)
				   throw new ArrayIndexOutOfBoundsException();
			   
			   Node<p> obj = new Node<p>(data);
			   temp.next.prev = obj;
			   obj.next= temp.next;
			     obj.prev = temp;
			            temp.next=obj;
			            return;
		   }
		   temp = temp.next;
		   index++;
	   }
   }
   
   void remove(int i)
   {
	   if(i<0)
		   throw new ArrayIndexOutOfBoundsException();
	   
	   if(i==0)
	   {
		   head=head.next;
		   head.prev=null;
		   return;
	   }
	   
	   Node<p> temp = head;
	   int index = 0;
	   
	   while(temp!=null)
	   {
		   if(index==-1)
		   {
			   if(temp.next==null)
			   {
				   temp.next = null;
			   tail=temp;
			   return;
			   }
			   else
			   {
				   temp.next = temp.next.next;
				   temp.next.prev = temp;
			   }
			   
		   }
		   temp = temp.next;
		   index++;
	   }
   }
   
   p get(int i)
   {
	   if(i<0)
		   throw new ArrayIndexOutOfBoundsException();
	   
	   Node<p> temp = head;
	   int index = 0;
	   
	   while(temp!=null)
	   {
		   if(index==i)
		   return temp.data;
		   
		   temp = temp.next;
		   index++;
	   }
	   throw new ArrayIndexOutOfBoundsException();
   }
   
   void set(int i,p data)
   {
	   if(i<0)
		   throw new ArrayIndexOutOfBoundsException();
	   
	   Node<p> temp = head;
	   int index = 0;
	   
	   while(temp!=null)
	   {
		   if(index==i)
		   {
			   temp.data = data;
			   return;
		   }
		   temp  = temp.next;
		   index++;
	   }
   }
   
   int indexof(p data)
   {
	   Node<p> temp = head;
	   int index=0;
	   
	   while(temp!=null)
	   {
		   if(temp.data==data)
			   return index;
		   temp=temp.next;
		   index++;
	   }
	   return -1;
   }
   
   int lastindexof(p data)
   {
	   Node<p> temp = head;
	   int index = 0;
	   int returnvalue=-1;
	   
	   while(temp!=null)
	   {
		   if(temp.data==data)
		   {
			   returnvalue = index;
		   }
		   temp = temp.next;
		   index++;
	   }
	   return returnvalue;
   }
   
   boolean contains(p data)
   {
	   Node<p> temp = head;
	   int index=0;
	   
	   while(temp!=null)
	   {
		   if(temp.data==data)
			   return true;
		   temp = temp.next;
		   index++;
	   }
	   return false;
   }
   
   @Override
	public String toString() 
   {
	  
	   String s = "[";
	   
	   Node<p> temp = head;
	   int index=0;
	   
	   while(temp!=null)
	   {
		   s = s+temp.data;
		   
		   if(temp.next!=null)
			   s = s+", ";
		   
		   temp = temp.next;
		   index++;
	   }
	   
	   s=s+"]";
	   return s;
	}
   
   int size()

   {
	   Node<p> temp = head;
	   int index=0;
	   
	   while(temp!=null)
	   {
		   temp = temp.next;
		   index++;
	   }
	   return index;
   }
   Object[] toarray()
   {
	   Object[] b = new Object[size()];
	   
	   Node<p> temp = head;
	   int index=0;
	   
	   while(temp!=null)
	   {
		     b[index++]=temp.data;
		     
		     temp = temp.next;
	   }
	   return b;
   }
   
   void print()
   {
	   Node<p> temp = head;
	   
	   while(temp!=null)
	   {
		   System.out.println(temp.data);
		   temp = temp.next;
	   }
	   System.out.println();
   }
}
