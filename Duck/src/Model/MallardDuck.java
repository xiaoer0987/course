package Model;

public class MallardDuck extends Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlywithWings();
	}
	public void display(){
		System.out.println("mallardduck");
	}

}
