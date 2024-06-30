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

//Given an array of integers, write a function to move all O's to end
// of it while maintainning the relative order of the non-zero elements.
function void moveZeros(int arr[]){
    int n = arr.length;
    int j = 0;
    
    for(int i = 0; i <n; i++){
        //pointer that focusing at the zero elements
        if(arr[i] != 0 && arr[j]==0){
            int temp = arr[i];//current reading value;
            arr[i] = arr[j]
            arr[j] = temp;
        }
        if (arr[j] != 0){
            j++;
        }         

    }
}