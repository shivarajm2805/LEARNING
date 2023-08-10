package studyopedia;
import java.util.Scanner;

public class Condition_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome To Kodnest");
		System.out.println("Enter a Marks");
		int marks=scan.nextInt();
		condition(marks);

	}
	public static void condition(int marks)
	{
		if (marks>=80)
		{
			System.out.println("Welcome To Tech Club");
		}
	}

}
