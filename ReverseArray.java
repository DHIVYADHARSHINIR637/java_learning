import java.util.*;
public class ReverseArray{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       int s=0;
       int e=n-1;
       while(s<e)
       {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
       }
    
       System.out.println(" The Reverse Array is:"+Arrays.toString(arr));
       sc.close();
    }
    
}
