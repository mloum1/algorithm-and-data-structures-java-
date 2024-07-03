public void reverseArr(int arr[], int start, int end){
    while(start < end){
        int temp = arr[i];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;  
    }
}

public int findMin(int arr[]){
    int min = 0;
    for(int i = 1; arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    return min;
}

public int findSecondMin(int arr[]){
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++ ){
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
public void moveZeros(int arr[]){

    int n = arr.length;
    int j = 0;
    
    for(int i = 0; i <n; i++){
        //pointer that focusing at the zero elements
        if(arr[i] != 0 && arr[j]==0){
            int temp = arr[i];//current reading value;
            arr[i] = arr[j];
            arr[j] = temp;
        }
        if (arr[j] != 0){
            j++;
        }         
    }
}

//Q . Given an array of n-1 distinct numbers in the range 
// of 1 to n. Find the missing number in it.

// Mathematical Approach 
// The sum of first n natural numbers = 1 + ... + n = n (n + 1)/2
public int findMissingNumberInArr(int arr[]){
    int n = arr.length + 1;
    int sum = n *(n+1)/2;
    for(int num : arr){
        sum = sum - num;
    }
    return sum;
}

// Q . Given a string, the task is check whether given string is 
// palindrole or not.
// Example : Given string "été"
// Solution - it should retrun - true
public  boolean isPalindrom(String word){
    char[] charArr = word.toCharArray();
    int start = 0;
    int end = word.length() - 1;
    while(start < end){
        if (charArr[start] != charArr[end]){
            return false;
        }
        start++;
        end--;
    }
    return true;
}

