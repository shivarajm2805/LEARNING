package studyopedia;

public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1 =new Fan(3,"black",3500,"crompton");
		Fan f2=new Fan(5,"White",7500,"Usha");
//		f1.no_Of_Wings=3;
//		f1.color="Black";
//		f1.cost=3500;
//		f1.brand="Crompton";
		System.out.println(f1.no_Of_Wings+" "+f1.color+" "+f1.cost+" "+f1.brand);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		f1.rotate();
		f1.blow_Air();
		
//		f2.no_Of_Wings=5;
//		f2.color="Red";
//		f2.cost=5000;
//		f2.brand="Vgaurd";
		System.out.println(f2.no_Of_Wings+" "+f2.color+" "+f2.cost+" "+f2.brand);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++=");
		f2.rotate();
		f2.blow_Air();

	}

}
