package dhivya;
import java.util.*;
class Palindrome{
	boolean isPalindrome(String word){
		int start=0;
		int end=word.length()-1;
		while(start<end){
			if(word.charAt(start)!=word.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
public class Prog42 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Palindrome obj=new Palindrome();
		System.out.println("Enter a word:");
		String str=sc.nextLine();
		if(obj.isPalindrome(str)){
			System.out.println(str+" is a palindrome");
		}
		else{
			System.out.println(str+"is not a paindrome");
		}
		
	}
}


