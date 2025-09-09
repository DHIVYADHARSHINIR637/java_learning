import java.util.*;
import java.io.*;
class GenerateSeriesPowerOfTwo{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            int sum=a;
            int pow2=1;
            for(int j=0;j<n;j++){
                sum+=pow2*b;
                System.out.print(sum+" ");
                pow2*=2;
            }
            System.out.println();
        }
        in.close();
    }
}

        
