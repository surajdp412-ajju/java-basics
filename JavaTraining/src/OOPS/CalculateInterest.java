// Method Overriding// 

package OOPS;

public class CalculateInterest {

	public static void main(String[] args) {
		
		AmericanExpress am = new AmericanExpress();
		BankOfAmerica ba = new BankOfAmerica();
		ICICIBank icici = new ICICIBank();
		
		System.out.println(am.getInterest());
		System.out.println(ba.getInterest());
		System.out.println(icici.getInterest());
	}

}

// here we can see Java is calling all the child class not a parent class where Interest is 0, this called runtime polymorphisim which method should be called// 
