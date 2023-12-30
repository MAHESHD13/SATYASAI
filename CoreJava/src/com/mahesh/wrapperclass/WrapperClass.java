package com.mahesh.wrapperclass;

class WrapperClass
{  
        public static void main (String args[])
        {  
                Integer Obj1 = new Integer (44);  
                Integer Obj2 = new Integer ("44");  
                Integer Obj3 = new Integer (55);  
                //compareTo() method
                System.out.println("Using compareTo() Obj1 and Obj2: " + Obj1.compareTo(Obj2));  
                System.out.println("Using compareTo() Obj1 and Obj3: " + Obj1.compareTo(Obj3));  

                //Equals() method
                System.out.println("Using equals() Obj1 and Obj2: " + Obj1.equals(Obj2));  
                System.out.println("Using equals() Obj1 and Obj3: " + Obj1.equals(Obj3));  
                Float f1 = new Float("10.25f");  
                Float f2 = new Float("12.63f");  
                Float f3 = new Float(10.25f);  
                System.out.println("Using compare() f1 and f2: " +Float.compare(f1,f2));  
                System.out.println("Using compare() f1 and f3: " +Float.compare(f1,f3));  
        
                //Addition of Integer with Float  
                Float f = Obj1.floatValue() + f1;  
                System.out.println("Addition of intObj1 and f1: "+ Obj1 +"+" +f1+"=" +f );  
        
                Integer int1 = Integer.valueOf("12345",10);  
                //Converting from binary to decimal  
                Integer int2 = Integer.valueOf("101011", 2);  
             
                //Converting from hexadecimal to decimal  
                Integer int3 = Integer.valueOf("D", 16);  
                System.out.println("Value of int1 Object: "+ int1);  
                System.out.println("Value of int2 Object: "+ int2);  
                System.out.println("Value of int3 Object: "+ int3);  
                System.out.println("Hex value of int1: " + Integer.toHexString(int1));    
                System.out.println("Binary Value of int2: "+ Integer.toBinaryString(int2));
    }    
}



