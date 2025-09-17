import java.util.*;
public  class Substringcomparision{
    public static String getSmallestAndLargest(String s,int n) {
        String smallest=s.substring(0,n);
        String largest=s.substring(0,n);
        for(int i=1;i<=s.length()-n;i++){
            String str=s.substring(i,i+n);
            if(str.compareTo(smallest)<0){
               smallest=str;
            }
               if(str.compareTo(largest)>0){
                largest=str;
               }
            }
        return smallest+"\n"+largest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(getSmallestAndLargest(s,n));
    }
}
