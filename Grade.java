package control;
import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your grade:");
		String grade= sc.nextLine();
		String result = switch(grade) {
		case "O" -> "Outstanding performance!";
		case "A+" -> "Excellent performance";
		case "A" -> "Very Good Performance";
		case "B+" -> "Good Performance";
		case "B" -> "Above Average Performance";
		case "C" -> "Average Perfomance";
		case "P" -> "Pass";
		case "F" -> "Fail";
		default -> "Invalid Grade";
		};
		sc.close();
		System.out.println("Grade: " + grade);
		System.out.println("Result: " + result); 
	}
	
}