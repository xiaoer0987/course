package entity;

public class Guitar {
	private String serialNumber;
	private double price;	
	private int numStrings;
	GuitarSpec spec;
	public Guitar(String serialNumber,double price,int numStrings,GuitarSpec spec) {
		// TODO Auto-generated constructor stub
		this.serialNumber = serialNumber;
		this.price = price;
		
		this.numStrings = numStrings;
		this.spec = spec;
	}
	
	public String getSerialNumber(){
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber){
		this.serialNumber = serialNumber;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public GuitarSpec getSpec(){
		return spec;
	}

	public int getNumStrings(){
		return numStrings;
	}
	public void setNumStrings(int numStrings){
		this.numStrings = numStrings;
	}

}
