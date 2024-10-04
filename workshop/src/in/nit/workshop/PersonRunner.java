package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
		
		System.out.println("main method is started");
		
		// assign the value
		person.country = "india";
		System.out.println("country is:"+person.country);
		
		// assign the value
		person.state = "karnataka";
		System.out.println("state is:"+person.state);
		
		person person = new person(); 
		
		//assign the value
		person.personName="peddu";
		System.out.println("person name is:"+person.personName);
		
		
   
	}

}

