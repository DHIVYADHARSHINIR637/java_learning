import java.util.*;
public class Kthminandmaxofsortedarray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int kthmin=arr[k-1];
        int kthmax=arr[n-k];
        System.out.println("The Kth Maximum elements is:"+kthmax);
        System.out.println("The kth minimum elements is:"+kthmin);
        sc.close();

    }
}
