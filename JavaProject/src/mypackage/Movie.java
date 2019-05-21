package mypackage;
// movie ratings g for general audiance, PG parental guidence, pg13 etc
public class Movie {
private String NameoftheMovie;
private int MovieYear;
private Double MovieRating;

public Movie(String NameoftheMovie,int MovieYear,Double MovieRating) {
	this.NameoftheMovie=NameoftheMovie;
	this.MovieYear=MovieYear;
	this.MovieRating=MovieRating;
}


public String toString() {
	return "Movie name: "+NameoftheMovie + "\nYear released: "+ MovieYear + 
			"\nRating: "+MovieRating ; 
}

}
