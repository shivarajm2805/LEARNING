package studypedia;

import java.util.Scanner;

public class Nested_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number ");
		Scanner scan=new Scanner(System.in);
		int num2=scan.nextInt();
		if(num2%2!=0)
		{
			System.out.println("Number is odd");
		}
		else
		{
			if(num2%4==0)
			{
				System.out.println("Number is multiple of 4");
			}
			else if (num2%6==0)
			{
				System.out.println("Number is multiple of 6");
			}
			else
			{
				System.out.println(" Number is Even");
			}
		}

	}

}
