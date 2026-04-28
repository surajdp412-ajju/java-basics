package OOPS;

public class BMW extends Car { // here we are setting up inheritance b/w BMW and Cars so we have used "extends" keyword//
	// here the BMW is a child class and Car is the parent class // 
	
	/*static String name = "BMW";*/
	
	BMW(){
		
		super();// here we are calling the constructor as well //		
		System.out.println("Calling BMW Constructor");
		
	}
	
	String name = "BMW";
	
	/*public void setWheeels( // here we cannot define same method as final method is already defined // 
	}*/
	
	public void getName(){
		System.out.println(name);
		System.out.println(super.name);// here were are printing the name immediate to this parent class in Car using "super" keyword //
		
	}
	
	public void run(){
		System.out.println("BMW is running");
		super.run();// here we are accessing the parent class method as well // 
	}
	
	
	public static void main(String[]args){
		
		/*Car car = new Car();// here we are able to create a object in the parent class //
		System.out.println(name);// printing name of the car //
		car.run(); */   // calling the method of the parent class here we can see the code reusability as well // 
	
		BMW bmw = new BMW();
		bmw.run();
		
	}
	
}
