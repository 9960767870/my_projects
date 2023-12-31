package Wrapper_Classes_In_Number_Class;

public class Wrapper_Class_In_Short_Class {


    public static void main(String[] args) 
    {
  
        short b = 55;
        String bb = "45";
          
        // Construct two Short objects
        Short x = new Short(b);
        Short y = new Short(bb);
  
        // toString()
        System.out.println("toString(b) = " + Short.toString(b));
  
        // valueOf()
        // return Short object
        Short z = Short.valueOf(b);
        System.out.println("valueOf(b) = " + z);
        z = Short.valueOf(bb);
        System.out.println("ValueOf(bb) = " + z);
        z = Short.valueOf(bb, 6);
        System.out.println("ValueOf(bb,6) = " + z);
  
        // parseShort()
        // return primitive short value
        short zz = Short.parseShort(bb);
        System.out.println("parseShort(bb) = " + zz);
        zz = Short.parseShort(bb, 6);
        System.out.println("parseShort(bb,6) = " + zz);
          
        //decode()
        String decimal = "45";
        String octal = "005";
        String hex = "0x0f";
          
        Short dec = Short.decode(decimal);
        System.out.println("decode(45) = " + dec);
        dec = Short.decode(octal);
        System.out.println("decode(005) = " + dec);
        dec = Short.decode(hex);
        System.out.println("decode(0x0f) = " + dec);
  
        System.out.println("bytevalue(x) = " + x.byteValue());
        System.out.println("shortvalue(x) = " + x.shortValue());
        System.out.println("intvalue(x) = " + x.intValue());
        System.out.println("longvalue(x) = " + x.longValue());
        System.out.println("doublevalue(x) = " + x.doubleValue());
        System.out.println("floatvalue(x) = " + x.floatValue());
          
        int hash = x.hashCode();
        System.out.println("hashcode(x) = " + hash);
          
        boolean eq = x.equals(y);
        System.out.println("x.equals(y) = " + eq);
          
        int e = Short.compare(x, y);
        System.out.println("compare(x,y) = " + e);
          
        int f = x.compareTo(y);
        System.out.println("x.compareTo(y) = " + f);
          
          
        short to_rev = 45;
        System.out.println("Short.reverseBytes(to_rev) = " + Short.reverseBytes(to_rev));
    }
}
