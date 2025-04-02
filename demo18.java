import java.util.Scanner;
public class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int score=scan.nextInt();
        if(score<50)
        {
               System.out.println("need to improved");
        }
        else if(score>=50 || score<70){
            System.out.println("good job");
        }
        else{
            System.out.println("excellents");
        }
    }


}
