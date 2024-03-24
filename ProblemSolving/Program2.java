import java.util.*;

class SqrtOptimized {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		int num = sc.nextInt();
		int start = 1;
		int end = num;
		int count;
		int mid = 0;
		int nPs = 0;
		for(count = 0; start<=end; count++){
			
			mid = (start+end)/2;
			if(mid*mid == num) {
				System.out.println("Iteration are " + count);
				System.out.println("Square root of " + num + "is " + count);
				return;
			}else if(mid*mid > num){
				end = mid-1;
			}else{
				nPs = mid;
				start = mid+1;
			}
			
		}

		System.out.println("Square root of " + num + " is " + nPs);
		System.out.println("Iterations are " + count);
	}
}
