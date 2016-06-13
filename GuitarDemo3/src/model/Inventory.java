package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import IDao.InventoryIDao;

public class Inventory {
	  private static List guitars;
	  private InventoryIDao   inventoryIDao ;
	  public Inventory() {
	    guitars = new LinkedList();
	  }
	//库存增加：
	  public void addGuitar(String serialNumber, double price,
	                        GuitarSpec spec) {
	  Guitar guitar = new Guitar(serialNumber, price, spec);
	  guitars.add(guitar);
	  System.out.println(guitars.size());
	  
	  }
	  //搜索
	  public static List search(GuitarSpec searchSpec) {
	    List matchingGuitars = new LinkedList();
	    System.out.println("nihao"+guitars.size());
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	     System.out.println("gagagagagaga"+guitar.getSerialNumber());
	      //调用spec里面的matches方法
	      //如果库存里面的吉他匹配用户构想的吉他规格就在匹配列表中添加。
	      if (guitar.getSpec().matches(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }
	  
	  
	  public Guitar getGuitar(String serialNumber) {
		    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
		      Guitar guitar = (Guitar)i.next();
		      if (guitar.getSerialNumber().equals(serialNumber)) {
		        return guitar;
		      }
		    }
		    return null;
		  }
	}
