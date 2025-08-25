import java.util.*;
public class TravelAgency{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n1=Arrays.binarySearch(arr,target);
        System.out.println(n1==-1?"No Ticket":"seat"+n1);

    }
}
