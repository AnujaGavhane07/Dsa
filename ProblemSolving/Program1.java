//	Find square root of given number
//
import java.util.*;
class SqrRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1; i*i<=num; i++) {
			count++;

			if(i*i == num) {

				System.out.println("Iterations are " + count);
				System.out.println("Square root of " + num + " is " + i);
				return;
			} 
		}
		System.out.println("Iterations are " + count);
		System.out.println("Square root of " + num + " does not exist.");
	}
}
