import java.util.*;
class CircularKeyboard{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String keyboard="abcdefghijklmnopqrstuvwxyz";
        String word =sc.nextLine();
        int currentpos=0;
        int targetmoves=0;
        for(int i=0;i<word.length();i++)
        {
            int targetpos=word.charAt(i);
            int targetval=keyboard.indexOf(targetpos);
            int c=Math.abs(targetval-currentpos);
            int a=keyboard.length()-c;
            targetmoves=Math.min(c,a);
            currentpos=targetmoves;
            }
            System.out.println("the total uint of keyboards is:"+targetmoves);
            sc.close();
        }
}
