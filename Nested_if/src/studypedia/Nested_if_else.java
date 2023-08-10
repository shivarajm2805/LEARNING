package studypedia;

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		if (num1>0)
		{
			System.out.println("Number is Positive Integer");
			if(num1%2==0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is odd");
			}
		}
		else
		{
			System.out.println("Number is Negative  ");
		}
		

	}

}
