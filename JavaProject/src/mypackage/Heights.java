package mypackage;
//one dimentional array
import java.util.Scanner;
// to calculate the average height and max height of a number of students
public class Heights {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int numStudents;
		double [] heights; // declaring an array
		System.out.println("how many students do you have?");
		numStudents=input.nextInt();
		heights= new double[numStudents]; // instantiating the array
		
		for( int i=0; i<numStudents;i++)
		{
			System.out.println("Enter height");
			heights[i]=input.nextDouble();
			
		}
		
		double maxHeight= heights[0];
		for (int i=1; i<heights.length;i++)
		{
			if(maxHeight<heights[i])
				maxHeight=heights[i];
		}
		double total=0;
		for (int i=0;i<heights.length;i++)
		{
			total +=heights[i];
		}
		System.out.println("the tallest student is "+ maxHeight + " inches");
		System.out.println("the average student is "+ (total/numStudents) +" inches");
	}

}
