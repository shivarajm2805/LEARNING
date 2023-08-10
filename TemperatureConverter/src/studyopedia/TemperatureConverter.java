package studyopedia;
import java.util.Scanner;


public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a temperature ");
		double fahrenheit=scan.nextDouble();
		App app=new App();
		System.out.println(app.convertFahrenheitToCelsius( fahrenheit));
		
		

	}
	
	

}
