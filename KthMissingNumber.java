import java.util.*;
public class KthMissingNumber{
    public static int findkthMissing(int[] arr,int k){
        int missingcount=0;
        int current=1;
        int index=0;
        while(true){
            if(index<arr.length && arr[index]==current){
                index++;
            }
            else{
                missingcount++;
                if(missingcount==k){
                    return current;
                }
            }
            current++;
        }
    }
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          int k=sc.nextInt();
          System.out.println(findkthMissing(arr,k));
        }
    }
