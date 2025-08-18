import java.util.*;
public class MaxSubArraySum{
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int currentsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<n;i++){
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            maxsum=Math.max(maxsum,currentsum);

        }
        System.out.println("Maximum subArray sum= "+maxsum);
    }
}
