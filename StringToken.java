import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s=s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
            return;
        }
        String[] token=s.split("[^A-Za-z]+");
        System.out.println(token.length);
        for(String result:token)
        {
            System.out.println(result);
        }
    }
}

