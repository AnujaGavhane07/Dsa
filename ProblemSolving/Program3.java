class SecondLargestArr {
	public static void main(String[] args) {
		int[] arr = new int[]{40,10,20,40, 30};
		int sMax = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(nums[i] > max) {
				max = nums[i];
			}else if(nums[i] > sMax && nums[i] != max) {
				sMax = nums[i];
			}
		}
		System.out.println(sMax);
	}
}

