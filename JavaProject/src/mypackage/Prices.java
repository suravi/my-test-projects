package mypackage;

import java.util.Scanner;

public class Prices {
// two dimenational array 
	public static void main(String[] args) {
		// [row][column] 5 is row 2 is column
		double[][] prices=new double[5][2]; 
		Scanner input= new Scanner(System.in);
		
		for (int i=0;i<5;i++)
		{
			System.out.println("enter the original price: ");
			prices[i][0]=input.nextDouble();
			prices[i][1]=prices[i][0]*.70; //30%off
		}
		for (int i=0;i<5;i++)
		{
			System.out.println(" original price: $" +prices[i][0] +
			"\tdiscounted price $"+prices[i][1]);
		}
	}

}
