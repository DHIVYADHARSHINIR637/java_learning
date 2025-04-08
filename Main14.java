import java.util.*; 
class Main14{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String reverse="";
        String b=s;
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse+=s.charAt(i);

        }
        System.out.println("the reverse string:"+reverse);
        if(reverse.equals(b))
        {
            System.out.println("give string is palidrome");
        }
        else{
            System.out.println("not a string");
            
        }
    }
}
