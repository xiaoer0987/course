package Test;

import Model.Duck;
import Model.MallardDuck;

public class DuckSimulator {

	public DuckSimulator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.perdformQuack();
		mallardDuck.performFly();
		System.out.println("mallardDuck");
		
	}

}
