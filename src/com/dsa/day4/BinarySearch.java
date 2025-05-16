package com.dsa.day4;

public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[]={2,4,5,6,7,9,10};
        // decreasing order array
        int arr1[]={10,9,8,7,6,5,4,3,1};

        // binarySearch(arr, 5);
        // binarySearch(arr, 199);

       // binarySearchDesc(arr1, 5);
      
       binarySearchOrderAgnostic(arr, 4);
        binarySearchOrderAgnostic(arr1, 5);
    }

    // to aaply binary search array should be sorted 
    /*  
      mid=start+end ; // yaha pai integer overflow ki problem ho sakti hai isaliye hum ye formula use karenge
      mid=start+(end-start)/2;
     */

     public static void binarySearch(int arr[],int target)
     {

        int ans=-1;
        int start=0;
        int end=arr.length-1;
        
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                break;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }
        }
        if(ans==-1)
          System.out.println("Element not found");
        else
          System.out.println(target+" Element Found  at index "+ans);
     }
     public static void binarySearchDesc(int arr1[],int target)
     {
        int ans=-1;
        int start=0;
        int end=arr1.length-1;
        while (start<=end) {
             int mid=start+(end-start)/2;

             if(arr1[mid]==target)
             {
                ans=mid;
                break;
             }
             else if(arr1[mid]<target)
             {
                end=mid-1;
             }
             else
             {
                start= mid+1;
             }

        }
      if(ans==-1)

          System.out.println("Element not found");
        else
          System.out.println(target+" Element Found  at index "+ans);
     }

     // Order Agnostic Binary search mean yaha pai hume pata nahi hota array kis order mai hai.
     public static void binarySearchOrderAgnostic(int arr[],int target)
     {
          int start=0;
          int end=arr.length-1;
        if(arr[start]<=arr[end]) // if its condition true then array as order mai otherwise des order mai hai.
        {
          binarySearch(arr, target);  
        }
        else
        {
          binarySearchDesc(arr, target);
        }
     }
}
