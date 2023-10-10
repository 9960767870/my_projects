package Practice_Set;

public class StringBuilder_Class {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Rushi");
		str.append("kesh");
		System.out.println("String " + str.toString());
		
		// create a StringBuilder object
        // usind StringBuilder(CharSequence) constructor
		StringBuilder str1 = new StringBuilder("aabbccddee");
		System.out.println("String1 " + str1.toString());

        // create a StringBuilder object
        // usind StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);
		System.out.println("String2 capacity " + str2.capacity());

        // create a StringBuilder object
        // usind StringBuilder(String) constructor
		StringBuilder str3 = new StringBuilder(str1.toString());
		System.out.println("String3 " + str3.toString());

	}

}
