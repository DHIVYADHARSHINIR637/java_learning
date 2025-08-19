import java.util.*;
public class Anagrams{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char s11[]=s1.toCharArray();
        char s22[]=s2.toCharArray();
        if(s1.length() != s2.length())
        {
            System.out.println("Not Anagrams");
          
           return;
        }
        Arrays.sort(s11);
        Arrays.sort(s22);
        if(Arrays.equals(s11,s22))
        {
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagram");
        }


    }
}
