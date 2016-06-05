package Model;

public class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	public void swim(){
		System.out.println("Swim");
	}
	public void display(){
		System.out.println("display");
	}
	public void perdformQuack(){
		try {
			quackBehavior.quack();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void performFly( ){
		try {
			flyBehavior.fly();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setQuackBehavior(QuackBehavior behavior){
		this.quackBehavior = behavior;
	}
	public void setFlyBehavior(FlyBehavior behavior){
		this.flyBehavior = behavior;
	}
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}

}
