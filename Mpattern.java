import java.util.*;
public class  Mpattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(j==0 ||j==n-1 ||( j==i && i<=n/2)  || (j==n-1-i && i<=n/2 )) {
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }      
             }
             System.out.println();
        }

    }
    
}
