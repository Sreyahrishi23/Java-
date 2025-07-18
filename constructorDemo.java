package sreya;
import java.util.Scanner;
class Book{
	String title;
	String author;
	double price;
	Book(){
		title = "unknown";
		author = "Not assigned";
		price = 0.0;
	}
	public void displayDetails() {
		System.out.println("title:\t"+title);
		System.out.println("author:\t"+author);
		System.out.println("price:\t"+price);
	}
	public class constructorDemo{
		public static void main(String[] args) {
			Book book = new Book();
			book.displayDetails();
		}
		
	}
}
