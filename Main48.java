class Main48{
    public static void main(String args[])
    {
        int a=9,b=12;
        int  c=a & b;
        System.out.println("a&b is"+  c);
        c=a | b;
        System.out.println("a|b is"+ c);
        c=a ^ b;
        System.out.println("a^b is"+c);
       // c=a~b;
       //
       //  System.out.println("a~b is"+c);
       int d=4;
       System.out.println(d<<2);
       System.out.println(d>>5);
       int e=-5;
        System.out.println(e>>5);
         System.out.println(d>>>1);//right shift zero fill

    }
}
}
