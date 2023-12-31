package Wrapper_Classes_In_Number_Class;

public class Wrapper_Class_In_Byte_Class {

	public static void main(String[] args) 
    {
   
        byte b = 55;
        String bb = "45";
           
        // Construct two Byte objects
        Byte x = new Byte(b);
        Byte y = new Byte(bb);
   
        // toString()
        System.out.println("toString(b) = " + Byte.toString(b));
   
        // valueOf()
        // return Byte object
        Byte z = Byte.valueOf(b);
        System.out.println("valueOf(b) = " + z);
        z = Byte.valueOf(bb);
        System.out.println("ValueOf(bb) = " + z);
        z = Byte.valueOf(bb, 6);
        System.out.println("ValueOf(bb,6) = " + z);
   
        // parseByte()
        // return primitive byte value
        byte zz = Byte.parseByte(bb);
        System.out.println("parseByte(bb) = " + zz);
        zz = Byte.parseByte(bb, 6);
        System.out.println("parseByte(bb,6) = " + zz);
           
        //decode()
        String decimal = "45";
        String octal = "005";
        String hex = "0x0f";
           
        Byte dec=Byte.decode(decimal);
        System.out.println("decode(45) = " + dec);
        dec=Byte.decode(octal);
        System.out.println("decode(005) = " + dec);
        dec=Byte.decode(hex);
        System.out.println("decode(0x0f) = " + dec);
   
        System.out.println("bytevalue(x) = " + x.byteValue());
        System.out.println("shortvalue(x) = " + x.shortValue());
        System.out.println("intvalue(x) = " + x.intValue());
        System.out.println("longvalue(x) = " + x.longValue());
        System.out.println("doublevalue(x) = " + x.doubleValue());
        System.out.println("floatvalue(x) = " + x.floatValue());
           
        int hash=x.hashCode();
        System.out.println("hashcode(x) = " + hash);
           
        boolean eq=x.equals(y);
        System.out.println("x.equals(y) = " + eq);
           
        int e=Byte.compare(x, y);
        System.out.println("compare(x,y) = " + e);
           
        int f=x.compareTo(y);
        System.out.println("x.compareTo(y) = " + f);
    }
}
