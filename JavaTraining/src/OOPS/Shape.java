// Abstract class //

package OOPS;

abstract public class Shape {
	
	abstract public void displayshape(); // no implementation is available for this method so it is abstract //

	// above we can see abstract class is defined and extended with an abstract method //
	
	public void displayName(){ // this is a non-abstract method which has a body and implementation //
		
		System.out.println("From Shape Class");
		
	}
	
}
