package studyopedia;

import java.util.Scanner;

public class Condition_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome To Kodnest");
		System.out.println("Enter a Marks");
		int marks=scan.nextInt();
		Check c=new Check();
		c.checkeligiblity(marks);

	}

}
