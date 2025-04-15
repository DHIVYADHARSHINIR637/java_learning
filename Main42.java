import java.util.*;
class Main42{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][2];
        int[][] b=new  int[2][4];
        int[][] c= new int[3][4];
        System.out.println("enter the martrix a:");
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the a matrix b:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    
                }
            }
        }
        System.out.println("result:");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
