package control;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int origin = number;
		int reverse = 0, reminder;
		while(number>0) {
			reminder = number%10;
			reverse = reverse*10 + reminder;
			number = number/10;
		}
		if(origin==reverse) {
			System.out.println("The number is a palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	}

}
