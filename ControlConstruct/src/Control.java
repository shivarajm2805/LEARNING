import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
//      System.out.println("enter the purchase amount: ");
      double purchaseAmount=scan.nextDouble();
      checkDiscount(purchaseAmount);
      
	}
	public static void checkDiscount(double a) {
		if (a>100) {
			System.out.println("Discount Applicable");
			
		}
		
	}

}
