class mergeSort{
    public static void mergeSort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left+(right-left)/2;
        //sport left half
        mergeSort(arr,left,mid);
        //sort right half
        mergeSort(arr,mid+1,right);
        //merge both half
        merge(arr, left, mid, right);
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge(int arr[], int left, int mid, int right) {
        int tempArr[] = new int[right - left + 1];
        int i = left;   // iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0; // iterator for temperory array that will point to the current index

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }
        //Copy remaning from Left part
        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }
        //Copy remaning from Right part
        while (j <= right) {
            tempArr[k++] = arr[j++];
        }
        //copy temperory into original array.
        for (k = 0, i = left; k < tempArr.length; k++, i++) {
            arr[i] = tempArr[k];
        }
    }
     public static void main(String args[]) {
        int arr[] = {4,3,6,3,2,6,7,4,2,9};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}