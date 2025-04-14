import java.util.*;
class Main41{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows of m1:");
        int row1=sc.nextInt();
        System.out.println("Enter no of column  of m1:");
        int col1=sc.nextInt();
        System.out.println("Enter no of row martrix2:");
        int row2=sc.nextInt();
        System.out.println("Enter no of column matrix2:");
        int col2=sc.nextInt();
        if(row1==col1 && row2==col2){
            int[][] a=new int[row1][col1];
            int[][] b=new int[row2][col2];
            int [][] c=new int[row1][col1];
            System.out.println("first matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("Enter  for"+i+" ,"+j+" ");
                a[i][j]=sc.nextInt();
            }
        }
         System.out.println("second matrix:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
              System.out.println("enter for"+i+" ,"+j+" ");

               b[i][j]=sc.nextInt();
            }
        }
        System.out.println("add of the matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++) {
                 c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("result of matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }  
        }
        else {
            System.out.println("order of the array:");
        }    
    }
}
