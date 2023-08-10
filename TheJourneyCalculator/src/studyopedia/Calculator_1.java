package studyopedia;
import java.util.Scanner;
public class Calculator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a distance and speed");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(speed,time));
	}

}
