/**
 * 
 */
package mypackage;
import java.util.Scanner;

/**
 * @author Meher
 *
 */
public class PaintHouse {

	
	public static void main(String[] args) {
		double length, width, height, windowsize, doorsize, surfacearea,windowspace,doorspace;
		int windowno,doorno;
		Scanner houseinput= new Scanner(System.in);
		System.out.println("please provide the length of the house");
		length=houseinput.nextDouble();
		System.out.println("please provide the width of the house");
		width=houseinput.nextDouble();
		System.out.println("please provide the height of the house");
		height=houseinput.nextDouble();
		
		System.out.println("please provide no of window of the house");
		windowno=houseinput.nextInt();
		System.out.println("please provide size of the window");
		windowsize=houseinput.nextDouble();
		System.out.println("please provide no of door of the house");
		doorno=houseinput.nextInt();
		System.out.println("please provide size of the door");
		doorsize=houseinput.nextDouble();
		
		windowspace=windowsize*windowno;
		doorspace=doorsize*doorno;
		surfacearea=((length*width)*2)+((width*height)*2)+((length*height)*2)-(windowspace)-(doorspace);
		System.out.println("the surface area is "+surfacearea);
	}

}
