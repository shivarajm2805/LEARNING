import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Grade");
		int grade=scan.nextInt();
		checkGrade(grade);
		
		

}
	public static void checkGrade(int grade) {
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	}
