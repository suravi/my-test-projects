package mypackage;

import java.util.Scanner;

public class MovieListing {

	public static void main(String[] args) {
		String NameoftheMovie;
		int MovieYear;
		Double MovieRating;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the information of your fav movie");
		System.out.println("Enter the movie Title");
		NameoftheMovie=input.next();
		
		System.out.println("Enter the movie released year");
		MovieYear=input.nextInt();
		
		System.out.println("Enter the movie rating");
		MovieRating=input.nextDouble();
		
		Movie cinema=new Movie(NameoftheMovie,MovieYear,MovieRating);
		System.out.println(cinema.toString());
	}

}
