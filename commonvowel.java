import java.util.*;
public class commonvowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=null,str2=null;
        String vowelss1="";
        String vowelss2="";
        str1=sc.nextLine();
        str2=sc.nextLine();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'||str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U')
            {
                vowelss1+=str1.charAt(i);
            }
        }
         for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u'||str2.charAt(i)=='A'||str2.charAt(i)=='E'||str2.charAt(i)=='I'||str2.charAt(i)=='O'||str2.charAt(i)=='U')
            {
                vowelss2+=str2.charAt(i);/
            }
        }
        int count =0;
        for(int i=0;i<vowelss1.length();i++) {
            for(int j=0;j<vowelss2.length();j++){
                    if(vowelss1.charAt(i)==vowelss2.charAt(j)){
                        count++;
                        break;
                    }
            }
        }
        System.out.println("the Vowels count="+count);



    }
}
