package entity;

public class Guitar {

	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;
	
	public Guitar(){
		// TODO Auto-generated constructor stub
		this.setSerialNumber(serialNumber);
		this.setPrice(price);
		this.setBuilder(builder);
		this.setType(type);
		this.setModel(model);
		this.setBackWood(backWood);
		this.setTopWood(topWood);
		
		
		
		
	}


	public String getSerialNumber() {
		return serialNumber;
	}

	

	public String getBuilder() {
		return builder;
	}


	public String getModel() {
		return model;
	}

	

	public String getType() {
		return type;
	}

	

	public String getBackWood() {
		return backWood;
	}

	

	public String getTopWood() {
		return topWood;
	}

	

	public double getPrice() {
		return price;
	}


	public void setSerialNumber(String serialNumber) {
		// TODO Auto-generated method stub
		this.serialNumber=serialNumber;
	}


	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price=price;
	}


	public void setBuilder(String builder) {
		// TODO Auto-generated method stub
		this.builder=builder;
	}


	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type=type;
	}


	public void setModel(String model) {
		// TODO Auto-generated method stub
		this.model = model;
	}


	public void setBackWood(String backWood) {
		// TODO Auto-generated method stub
		this.backWood=backWood;
	}


	public void setTopWood(String topWood) {
		// TODO Auto-generated method stub
		this.topWood=topWood;
	}

	

}
