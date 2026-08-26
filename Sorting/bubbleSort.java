//BUBBLESORT
//simply compare first 2 elements if the second is smaller swap them,
// then check for 2nd and 3rd if 3 is bigger swap them then go for 3rd and 4th ans so on..
// (each traversal from 1 to n will pick the largest and place it in last of the array)
// then repeat the same from the first element again

import java.util.*;

class bubbleSort{

public static void bubbleSort(int arr[]){
	for(int i=0; i<arr.length-1; i++){
		for(int j=0; j<arr.length-1-i; j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	for(int i=0; i<=arr.length-1; i++){
		System.out.print(arr[i]);//printing the resultant array
	}
}
public static void main(String args[]){
	int arr[] = {5,7,6,3,2,9};
	bubbleSort(arr);
}
}