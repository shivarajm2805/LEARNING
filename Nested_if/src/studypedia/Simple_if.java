package studypedia;

import java.util.Scanner;

public class Simple_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		if (num>=0)
		{
			if (num%2==0)
			{
				System.out.println("Number is Even");
			}
		}

	}

}
