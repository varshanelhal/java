package in.nit.workshop;

public class ArrayOperation {

	public static void main(String[] args) {
		// get the sum of array elements
		int numbers[] = {11,9,24,1,28};
		int sum = 0;
		for(int index = 0; index< numbers.length;index++) {
			sum = sum + numbers[index];
		}
		System.out.println("sum is:"+sum);
		
		// even and odd //if condition 
		for(int index=0;index<numbers.length;index++) {
		    if(numbers[index] %2==0) {
		    	System.out.println("it is a even number");
		    }else {
		    	System.out.println("it is odd number");
		    }
		    }
	}
}
