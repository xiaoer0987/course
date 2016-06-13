package allenum;

public enum Builder { 
	  FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, AMY;
	  public String toString() {
	    switch(this) {
	      case FENDER:   return "Fender";
	      case AMY:   return "AMY";
	      case MARTIN:   return "Martin";
	      case GIBSON:   return "Gibson";
	      case COLLINGS: return "Collings";
	      case OLSON:    return "Olson";
	      case RYAN:     return "Ryan";
	      case PRS :     return "PRS";
	      default:       return "Unspecified";
	    }
	  }
	}