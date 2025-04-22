  class Transpose{
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3,},{4,5,6},{7,8,9}};
        transpose(arr);
        for(int i=0;i<arr.length;i++)
        {
            reverserow(arr[i]);
        }
        reverse(arr);
    }
    public static void transpose(int[][] arr)
    {
           for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
             }
            
    }
    public static void reverserow(int[] row)
    {
        int start=0;
        int end=row.length-1;
        while(start<end)
        {
            int temp=row[start];
            row[start]=row[end];
            row[end]=temp;
            start++;
            end--;
        }
    }
    public static void reverse(int[][] arr)
    {
         for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<arr[0].length;j++)
            {
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
