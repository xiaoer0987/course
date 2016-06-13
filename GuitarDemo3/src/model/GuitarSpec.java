package model;

import allenum.Builder;
import allenum.Type;
import allenum.Wood;

public class GuitarSpec {
	//吉他的通有属性。  
	 private Builder builder; 
	  private String model;
	  private Type type;
	  private String numStrings;
	  private Wood backWood;
	  private Wood topWood;

	  
	  
	  public GuitarSpec(Builder builder, String model, Type type,
	                    String numStrings, Wood backWood, Wood topWood) {
	    this.builder = builder;
	    this.model = model;
	    this.type = type;
	    this.numStrings = numStrings;
	    this.backWood = backWood;
	    this.topWood = topWood;
	  }

	  public Builder getBuilder() {
	    return builder;
	  }

	  public String getModel() {
	    return model;
	  }

	  public Type getType() {
	    return type;
	  }

	  public String getNumStrings() {
	    return numStrings;
	  }

	  public Wood getBackWood() {
	    return backWood;
	  }

	  public Wood getTopWood() {
	    return topWood;
	  }
	  public void setBackWood(Wood backWood) {
			// TODO Auto-generated method stub
			this.backWood = backWood;
		}
	  public void setTopWood(Wood topWood){
		  this.topWood= topWood;
	  }
	  public void setModel(String model){
		  this.model=model;
	  }
	  
	  public void setNumStrings(String numStrings){
		  this.numStrings=numStrings;
	  }
	  public void setBuilder(Builder builder){
		  this.builder = builder;
	  }
	 
	  public void setType(Type type2){
		  this.type = type2;
	  }
	  //返回布尔类型。
	  public boolean matches(GuitarSpec otherSpec) {
	    if (builder != otherSpec.builder)
	      return false;
	    if ((model != null) && (!model.equals("")) &&
	        (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
	      return false;
	    if (type != otherSpec.type)
	      return false;
	    if (numStrings != otherSpec.numStrings)
	      return false;
	    if (backWood != otherSpec.backWood)
	      return false;
	    if (topWood != otherSpec.topWood)
	      return false;
	    return true;
	  }

	
	}