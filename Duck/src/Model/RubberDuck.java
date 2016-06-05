package Model;

public class RubberDuck extends Duck {

	public RubberDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlywithWings();
	}
	public void display(){
		System.out.println("rubberduck");
	}

}
