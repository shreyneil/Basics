package com.Philips.getOrganized;

public class child extends Main implements another <child>{
    static {
        try
        {
            String s1 = "666.66";
            String s2 = "0";
            double d = Double.parseDouble(s1);//string to primitive
            int i = Integer.parseInt(s2);//java does not throw an exception if u divide by an 0.0, only when u divide by an integer, u get an exception
            double d3 = d/i;
            Double d1 = Double.valueOf(s1); //string to wrapper
            if(d3 == Double.POSITIVE_INFINITY||d3==Double.NEGATIVE_INFINITY)
            {
                throw new ArithmeticException();
            }
            else
            {
                System.out.println(d3);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Returned " + e.getMessage() + " Arithmetic Exception Occurred");
        }
        //Setting try catch within the static block for all checked exceptions
//        StringBuilder s1 = new StringBuilder(30);
//        s1.append("I am");
//        s1.append(" the initializer");
//        System.out.println(s1.toString());
           }


    public child(){
        super(); //super for calling the base constructor should be the first statement in the base class constructor.
        System.out.println(super.str);//super cannot be used in a static block
        StringBuilder sb1 = new StringBuilder(30);
        sb1.append("I ");
        sb1.append("am ");
        sb1.append(" child.");
        System.out.println(sb1.toString());
        super.output(); //super can be called inside a method only


    }
    public child(int i , int j)
    {
        this();
         i= 2;
         j = 0;
         System.out.println("Printing the parameterized constructor" + i +"." +j);
    }

    protected void getChild(String str){

        System.out.println(str);
    }


    public void Display(child c)
    {
        System.out.println("Interface - Generic : Successful");
    }
}
