package pixi;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
public static void main(String[] args) {
	int [] arr = new int [] {25, 11, 7, 75, 56};  
	Test obj1=new Test();
	obj1.solution(arr);
	
}

public int []  solution(int[] A) {
   
		 //Initialize array   
    int[] arr = new int [] {5, 2, 5, 5, 6, 6, 10};   
      
    System.out.println("Duplicate elements in given array: ");  
    //Searches for duplicate element  
    for(int i = 0; i < arr.length; i++) {  
        for(int j = i + 1; j < arr.length; j++) {  
            if(arr[i] == arr[j])  
                System.out.println(arr[j]);  // arr[j];  list of duplicate int value  1
           
        }  
    }  
    // 1.5 find no of no of integere occuring multi time 
    int noOfNoRepetingMultiTime=0;
    HashMap<String, String> map= new HashMap<String, String>();
    
    for (int j : arr) {
		map.put(String.valueOf(j), null);
	}
    int firstelement=map.size();////1111111111
    
    System.out.println("firstele"+firstelement);
    int original[] =arr;
    Arrays.sort(arr);  
    int lowestDuplicate = 0;
    int highestDuplicate = 0;
    if(arr.length>0) {
    	lowestDuplicate=arr[0];///////////2
    	highestDuplicate=arr[arr.length-1];//////////////3
    	
    }
    
    Test.removeDuplicateElements(arr, arr.length);
  //printing array elements  
    for (int i=0; i<arr.length; i++)  {
       System.out.print(arr[i]+" ");  
}  
    int[] output = new int [] {firstelement, lowestDuplicate, highestDuplicate, 5, 6, 6, 10};   
return output;

}  
public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

}  


   


