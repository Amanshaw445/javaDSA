//maximum subarray Sum using prefix sum

class maxSubArr{

public static void maxSubArraySum(int arr[]){
	int currentSum = arr[0];
	int maxSum = arr[0];
	int prefix[] = new int[numbers.length];
	prefix[0] = arr[0];
	
	for(int i=1; i<prefix.length; i++){
		prefix[i] = prefix[i-1] + arr[i];
		if (currentSum > maxSum)
			{maxSum = currentSum;}
	}
	

}

public static void main(String[] args){
	int array[] = {1,2,3,4,5};
	maxSubArraySum(array);

}
}

// this code is incomplete and I will complete this after strings because is am getting distracted and cant focus and not able to write code myself. after this i will go to kadane's algorithm