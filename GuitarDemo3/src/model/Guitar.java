package model;

public class Guitar {

	

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String serialNumber;
	 
	private double price;
	  //����Guitarspec
	  GuitarSpec spec;

	  
	  public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
	
		//���ι��캯����
	 public Guitar(String serialNumber, double price, GuitarSpec spec) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.spec = spec;
	  }

	  

	
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(Double newPrice) {
	    this.price = newPrice;
	  }
	  public String getSerialNumber() {
			return serialNumber;
		}
		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}
	  public GuitarSpec getSpec() {
	    return spec;
	  }
	  
	  
	  
	  
	
		 public Guitar() {
				// TODO Auto-generated constructor stub
		}
	}