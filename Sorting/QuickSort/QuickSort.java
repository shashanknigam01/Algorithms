package com;

public class QuickSort {

	public static void main(String[] args) {
       int[] arr = new int[args.length];
	  
       for (int i = 0; i < args.length; i++) {
           arr[i] = Integer.valueOf(args[i]);
       }
	   quicksort(arr,0,arr.length-1);
	   
       for (int e : arr) {
          System.out.print(e+",");
       }
	   
	}
	
	private static void quicksort(int[] arr, int left, int right){
		
		int pivot = partition(arr, left, right);
		
		if(pivot < 0)
			return;
		
		if(left < pivot)
		 quicksort(arr, left, pivot-1);
		
		if(pivot < right)
		 quicksort(arr, pivot+1, right);
		
	}
	
	private static int partition(int[] arr, int left, int right){
		
		int pivot = left;
		int tmp;
		
		if(left == right || Math.abs(right-left) == 1){
			if(arr[left] > arr[right]){
			  tmp = arr[right];
			  arr[right] = arr[left];
			  arr[left] = tmp;
			}
			return -1;
		}
		
		while(left < right){
			
			if(pivot == left){
				if(arr[pivot] <= arr[right] ){
                  right--;					
				}else{
				  tmp = arr[right];
				  arr[right] = arr[left];
				  arr[left] = tmp;
				  pivot = right;
				  left++;
				}
	
			}else{
				if(arr[left] <= arr[pivot]){
	                  left++;					
				}else{
				  tmp = arr[right];
				  arr[right] = arr[left];
				  arr[left] = tmp;
				  pivot = left;
				  right--;
				}
			}
		}
		
		return pivot;
	}

}
