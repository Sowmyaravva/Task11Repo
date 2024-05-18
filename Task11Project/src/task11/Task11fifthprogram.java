package task11;

public class Task11fifthprogram {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            System.out.println(str.charAt(10)); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }

	}

}
