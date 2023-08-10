package studyopedia;
import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a First name and Last Name");
		String firstname=scan.next();
		String lastname=scan.next();
		System.out.println(joinStrings(firstname,lastname));
		

	}
	public static String joinStrings(String str1, String str2)
	{
		return(str1+" "+str2);
	}

}
