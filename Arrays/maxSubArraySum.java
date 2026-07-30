class maxSubArraySum{

public static int maxSum (int numbers[]) {
	int max = Integer.MIN_VALUE;
	for(int i=0; i<numbers.length; i++) {
		int start = i;
		for(int j=i; j<numbers.length; j++) {
			int end = j;
			int sum = 0;
			for(int k=start; k<=end; k++){
				sum = sum + numbers[k];
			}
			if (sum > max){
				max = sum;
			}
		}
	}
return max;
}

public static void main(String[] args){
	int numbers[] = {2,4,6,7,8};
	System.out.println(maxSum(numbers));

}
}