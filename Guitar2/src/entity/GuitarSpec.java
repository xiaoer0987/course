package entity;

public class GuitarSpec {
	
	private String builder;
	private String type;
	private String backWood;
	private String topWood;
	public GuitarSpec(String builder,String type,String backWood,String topWood) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	 public boolean matches(GuitarSpec otherSpec) {
		    if (builder != otherSpec.builder)
		      return false;
		   
		    if (type != otherSpec.type)
		      return false;
		    if (backWood != otherSpec.backWood)
		      return false;
		    if (topWood != otherSpec.topWood)
		      return false;
		    return true;
		  }

}
