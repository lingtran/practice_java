
public class ArrayExercise {

	public static void main(String[] args) {
		
		// creates a reference type variable
		int[] values;
		
		// allocate memory by pointing values reference to having three elements
		values = new int[3];
		
		// prints out 0 because no value at index 0 has been set
		System.out.println(values[0]);
		
		// set values
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		// iterate through array
		for(int i=0; i < values.length; i++){
			System.out.println(values[i]);
		}
		
		// specify values in a list, alternate form of expression
		int[] numbers = {5, 6, 7};
		
		for(int i=0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}

}
