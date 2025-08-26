import java.util.*;
public class LongestCommonPrefix{
    public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          String[] arr=s.split(" ");
          String comp=arr[0];
          Arrays.sort(arr);
          String fword=arr[0];
          String lword=arr[arr.length-1];
          String answer=" ";
          for(int idx=0;idx<=Math.min(fword.length()-1,lword.length());idx++){
            if(fword.charAt(idx)!=lword.charAt(idx))
            {
                break;
            }
            answer+=fword.charAt(idx);
          }
            System.out.println(answer);
     }
}










