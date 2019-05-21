package mypackage;

import java.util.Scanner;

/**
 * @author Meher
 *
 */
public class HospitalStay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double overnightcharge,medication, Lab, day, totalcost;
		String overnight,another;
		Scanner input= new Scanner(System.in);
		another="yes";
		
		do {
		System.out.println("Write y if Overnight Patient?");
		overnight=input.next();
		if(overnight.matches("y")){
		System.out.println("What is the overnight charge?");
		overnightcharge=input.nextDouble();
		} 
		else overnightcharge=0.0;
		
		System.out.println("What is the medication charges?");
		medication=input.nextDouble();
		System.out.println("What is the Lab charges?");
		Lab=input.nextDouble();
		
		calculation(overnightcharge,medication,Lab);
		
		System.out.println("Do you want do calculate for another patient? (y/n)");
		another=input.next();
	}while (another.equals("y"));
	
		System.out.println("Thanks for using our service");
		}
		
		public static void calculation (double overnightcharge,double medication, double Lab) {
			double totalcost=overnightcharge+medication+Lab;
			System.out.println("The total cost is "+totalcost);
		
		}
	
}
