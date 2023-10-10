package Spring.com.constructor;

import java.util.List;

public class Person 
{
	private String name;
	private int personId;
	private Certi certi;
	private List<Integer> list;
	
	
	public Person(String name , int personId,Certi certi, List<Integer> list) 
	{
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.list = list;
	}
	
	@Override
	public String toString() {
		
		return this.name+" : "+this.personId+this.list +"{"+this.certi.name+"}";
	}

}
