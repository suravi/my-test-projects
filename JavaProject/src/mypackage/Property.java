package mypackage;

public class Property {
	private double askingPrice;
	private String propertyType;
	private double lotSize;
	private int numBaths;
	private int numBeds;
	
	public Property() {
		super();
	}
	public Property(double askingPrice, String propertyType, double lotSize) {
		this.askingPrice = askingPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		this.numBaths=0;
		this.numBeds=0;
	}
	public Property(double askingPrice, String propertyType, 
			double lotSize, int numBaths, int numBeds) {
		
		this(askingPrice, propertyType, lotSize);

		this.numBaths = numBaths;
		this.numBeds = numBeds;
	}

	
	public double getAskingPrice() {
		return askingPrice;
	}
	public void setAskingPrice(double askingPrice) {
		this.askingPrice = askingPrice;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public double getLotSize() {
		return lotSize;
	}
	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}
	public int getNumBaths() {
		return numBaths;
	}
	public void setNumBaths(int numBaths) {
		this.numBaths = numBaths;
	}
	public int getNumBeds() {
		return numBeds;
	}
	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}
	public String toString() {
		return "Asking Price: "+askingPrice + "\nProperty Type: "+propertyType + 
				"\nlot size: "+lotSize + "\nNumber of baths "+numBaths + 
				"\nNumber of bedroom: "+numBeds ; 
	}

}
