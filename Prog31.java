package dhivya;
import java.util.*;
class Book{
	String title;
	String author;
	double price;
	void setDetails(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayBookDetails(){
		System.out.println("Book title: "+title);
		System.out.println("Author:"+author);
		System.out.println("price:"+price);
	}
}
public class Prog31 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Book obj=new Book();
		System.out.println("Enter book title:");
		String title=sc.nextLine();
		System.out.println("Enter a author name:");
		String author=sc.nextLine();
		System.out.println("Enter a price amount:");
		double price=sc.nextDouble();
		obj.setDetails(title, author, price);
		System.out.println("final book details:");
		obj.displayBookDetails();
		
		
	}

}
