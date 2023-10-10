package Wrapper_Classes_In_Number_Class;

public class Wrapper_Classes_In_Float_Class {

	public static void main(String[] args) 
    {
        float b = 55.05F;
        String bb = "45";
  
        // Construct two Float objects
        Float x = new Float(b);
        Float y = new Float(bb);
  
        // toString()
        System.out.println("toString(b) = " + Float.toString(b));
  
        // valueOf()
        // return Float object
        Float z = Float.valueOf(b);
        System.out.println("valueOf(b) = " + z);
        z = Float.valueOf(bb);
        System.out.println("ValueOf(bb) = " + z);
  
        // parseFloat()
        // return primitive float value
        float zz = Float.parseFloat(bb);
        System.out.println("parseFloat(bb) = " + zz);
  
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
  
        int e = Float.compare(x, y);
        System.out.println("compare(x,y) = " + e);
  
        int f = x.compareTo(y);
        System.out.println("x.compareTo(y) = " + f);
  
        Float d = Float.valueOf("1010.54789654123654");
        System.out.println("isNaN(d) = " + d.isNaN());
  
        System.out.println("Float.isNaN(45.12452) = " 
                                    + Float.isNaN(45.12452F));
  
        // Float.POSITIVE_INFINITY stores
        // the positive infinite value
        d = Float.valueOf(Float.POSITIVE_INFINITY + 1);
        System.out.println("Float.isInfinite(d) = " 
                            + Float.isInfinite(d.floatValue()));
  
        float dd = 10245.21452F;
        System.out.println("Float.toString(dd) = " 
                                        + Float.toHexString(dd));
  
        int float_to_int = Float.floatToIntBits(dd);
        System.out.println("Float.floatToLongBits(dd) = "
                                                + float_to_int);
  
        float int_to_float = Float.intBitsToFloat(float_to_int);
        System.out.println("Float.intBitsToFloat(float_to_long) = " 
                                                + int_to_float);
    }
}
