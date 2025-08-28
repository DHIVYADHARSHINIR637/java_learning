import java.util.*;
public class Findtheplace{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,3,5,6};
        int target=2; 
        int count=0;
        for(int n:arr)
        {
            if(n==target)
            {
                System.out.println(n);
                break;
            }
            else if(n<target)
            {
                count++;
            }
        }
        if(count!=0)
        {
            System.out.println(count);
        }
        
    }
}
