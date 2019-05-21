package mypackage;

public class RealEstateListings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Property land= new Property(1000,"land",2.1);
Property estate=new Property(2500,"estate", 1.5, 3,4);
Property a = new Property();
a.setAskingPrice(1000);
a.setNumBaths(4);
//System.out.println(land.toString());
//System.out.println(estate.toString());


System.out.println(a.toString());
//estate.setAskingPrice(230000);
//System.out.println(estate.toString());
	}

}
