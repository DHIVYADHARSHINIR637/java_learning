import java.util.*;
public class SubArrayDuplicates1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>l=new HashMap<>();
        int s=-1;
        int e=-1;
        int m=Integer.MAX_VALUE;
        boolean f=false;
        for(int i=0;i<n;i++){
            if(l.containsKey(arr[i])){
              int p=l.get(arr[i]);
              int length=i-p+1;
            if(length<m){
                m=length;
                s=p;
                e=i;
            }
            f=true;
        }
        l.put(arr[i],i);
    }
    if(f){
        System.out.println("Duplicate arrays are:");
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    else{
        System.out.println("No Duplicates is Found");
    }
    }
}
