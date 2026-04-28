// interface keyword // 

package OOPS;

public class EngineeringClass implements Student{ // here implements links into the interface //

	public void displayName() {
		System.out.println("Hi, We are from Engineering");
	}

	public void getStudentNumber() {
		System.out.println("We are 120 Students");
		
	}

	public void getStandard() {
		System.out.println("We are from Computer Science");
		
	}

// user must implement all the methods which is present inside the interface // 
	
	public void getUniversity(){
		System.out.println("University name is : " + Student.University);
	}

	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}

	}

