import java.util.*;
public class  Arraythreshold{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int threshold=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            count+=arr[i]/threshold; 
            if(arr[i]%threshold>0){
                count++;
            }
            else{
                count+=0;
            }
        }
        System.out.println(count);
        

    }
}
