package com.dsa.day5;
/* 
***biotonic array or mountain array -->
an array which if first increasing and then decreasing (may or may not be strict)
***peak value--> maximum value vaha se array decrease hone lagata hai.
*** monotonic type--> ek hi fashion mai increase hota hai
***biotonic type --> pehale increase hota hai then decrease hota hai.

*/

//we can apply binary search on biotonic array 
public class BitonikArray {
public static void main(String[] args) {
    
    // biotonic array (strictly because here not any duplicate value )
    int arr[]={2,3,5,6,7,23,17,14,12,9,4};
    int element= findMinElement(arr);
    System.out.println("Minimum Element is : "+element);

    int arr1[]={2,4,5,1,0};
    boolean res=validateMountainArray(arr1);
    System.out.println("array is biotonic or not : "+res);

    int peakElement=findPeakElement(arr);
    System.out.println("Peak Element at index : "+peakElement);

}
// find the minimum element in biotonic array 
public static int findMinElement(int arr[])
{

    if(arr.length==0)
    {
        System.out.println("Array is empty ");
        return -1;
    }
    int first=arr[0];
    int last=arr[arr.length-1];
      return first<last?first:last;
}

// validate mountain array 
// note --> atleast 3 length need of array to proof biotanic array 
public static boolean validateMountainArray(int arr[])
{
    int index=0;
    int n=arr.length-1;
    // for find increasing order all element
    while(index<n)
    {
        if(arr[index]<arr[index+1])
        {
            index++;

        }else{
            break;
        }

    }

    if(index==0 || index==n)
    {
        return false;
    }
     while(index<n)
    {
        if(arr[index]>arr[index+1])
        {
            index++;

        }else{
            break;
        }
    }

    return (index==n);
}


// find peak element in mountain array 
public static int findPeakElement(int []arr)
{
    int start=0;
    int end=arr.length-1;
    int n=arr.length-1;

   while(start<=end)
   {
       int mid=start+(end-start)/2;
        if(mid!=0 && mid!=n-1 && arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1])
            {
                 return mid;
            }
            else if(mid!=n && arr[mid]<arr[mid+1]) 
            // increasing 
            {
                start=mid+1;

            }
            // decreasing order 
            else
            {
                end=mid-1;
            }
   }
    return -1;
}
}
