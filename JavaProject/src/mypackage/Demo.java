/**
 * 
 */
package mypackage;
import java.util.Scanner;
/**
 * @author Meher
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] arrays= new double[3];
		Scanner input= new Scanner(System.in);
		//System.out.println("Hello, up and running with java");
		System.out.println("please input 3 numbers");
		for (int i=0;i<3;i++) {
		arrays[i]=input.nextDouble();
		}
		/*
		 * arrays[1]=input.nextDouble(); arrays[2]=input.nextDouble();
		 */
		double totalvalue=arrays[0]+arrays[1]+arrays[2];
		// we are contacting the value with the text thats why need + sign
		//System.out.println("Total value is "+totalvalue);
		//printf is for formatting
		// 5 position to the left and 2 positions to right and float value
		// we dont need + as the value is replacing the format $%5.2f but we need a comma
		System.out.printf("Total value is: $%5.2f",totalvalue ); 
		System.out.println();
		//implicit conversion u must use decimal to get the result in decimal
		System.out.println((5+6+2)/2);
		System.out.println((5+6+2)/2.0);
	}

}
