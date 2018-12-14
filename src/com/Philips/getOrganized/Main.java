package com.Philips.getOrganized;

public class Main extends abs{
       String str = "Parent";
       //Defining a nested class within the Main
       public static class nested{

           private void func()
           {
               System.out.println("I am the nested inside enclosing");
           }
       }
       public Main(){
           int i = 1;
           StringBuilder stb = new StringBuilder(30);
           stb.append("I am the ");
           stb.append(i);
           stb.append(" constructor");
           System.out.println(stb.toString());
       }
    public static void main(String[] args) {
        System.out.println("is it organized");
        StringBuilder sb = new StringBuilder(40);//Using string builder
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb.toString());
        Main.nested n1 = new Main.nested();
        n1.func();
        //enclosing class main can access private members of the nested class.
        child ch = new child();
        ch.getChild("Java is my task");//calling protected method of child class
        ch.Display(ch);
        String s1 = "I Love";
        s1 += " Java";
        String s2 = "I Love";
        s2 += " Java";
        String s3 = s1.intern();//intern used for making instances point to the same reference
        String s4 = s2.intern();
        if (s1 == s3 || s2 == s4) {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }

    }
    public void calc(int i, int j)
    {
          i=2;
          j=1;
          int z = i-j;
        //System.out.println("Implementing the abstract method "+ z);
    }
    //final can be used as below to prevent overriding.
    public final void output()
    {
        System.out.println("Main: Parent");
    }
}

