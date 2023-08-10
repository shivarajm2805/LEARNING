package studyopedia;

import java.util.Scanner;

public class If_elseConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Score ");
		Scanner scan =new Scanner(System.in);
		int score =scan.nextInt();
		GradeCalcuklate g1=new GradeCalcuklate();
		g1.grade(score);
		
		

	}

}
