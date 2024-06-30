function void reverseArr(int arr[], int start, int end){
    while(start < end){
        int temp = arr[i];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;  
    }
}

function int findMin(int arr[]){
    int min = 0;
    for(int i = 1; arr.length; i++){
        if(arr[i] < min){
            min = arr[i]
        }
    }
    return min;
}

function int findSecondMin(int arr[]){
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int i = 0; < arr.length; i++ ){
        if(arr[i] > max){
            secondMax = max;
            max = arr[i];
        }else if(arr[i] > secondMax && arr[i] != max){
            secondMax = arr[i];
        }
    }
    return secondMax;
}

function 