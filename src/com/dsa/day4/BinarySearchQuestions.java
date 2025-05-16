package com.dsa.day4;

import java.util.Arrays;

public class BinarySearchQuestions {
  public static void main(String[] args) {
    int arr[]={2,2,3,4,4,5,6,7,9};
    // binarySearch1(arr, 4, true);
    // binarySearch1(arr, 4, false);
/* 
    int check[]=searchRange(arr, 4);
    int check2[]=searchRange(arr, 90);
    System.out.println(Arrays.toString(check));
    System.out.println(Arrays.toString(check2));
 
    */

    /* 
    int numbers[]={4,4,8,8,8,16,23,23,42};
     int check[]=searchRange(numbers, 3);
    
    // count all Occuarance of Target [n,n] here both inclusive

    if(check[0]==-1)
    {
        System.out.println("Element not present");
    }
    else{
    System.out.println("Occuarance of target : "+(check[1]-check[0]+1));
  }
 int res=binarySearchFloor(arr, 8);
 System.out.println("Floor value "+res);

 */


 /* 
int []ages={2,4,8,12,14,17,19};
int res=findAbsoluteMinimumDif(ages, 12);
System.out.println("absolute diffrence is : "+res);

int res1=findAbsoluteMinimumDif(ages, 10);
System.out.println("absolute diffrence is : "+res1);
*/


int arr3[]={2,2,4,5,7,9,25,56,88,94};
int range[]=findRangeOfInfiniteArray(arr3, 25);
//System.out.println(range[0]+"  "+range[1]);

int res1=binarySearchInRange(arr3, 25,range[0],range[1] );

  System.out.println(res1==-1?"not exist ":" exist ");
}

  // find first occuarance of element  in binary search
   public static void binarySearch1(int arr[],int target, boolean isFirst)
     {

        int ans=-1;
        int start=0;
        int end=arr.length-1;
        
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(isFirst)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                
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

      // find first occuarance of element  in binary search
   public static int binarySearch(int arr[],int target, boolean isFirst)
     {

        int ans=-1;
        int start=0;
        int end=arr.length-1;
        
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(isFirst)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }
        }
        return ans;
     }

     //Find First And Last Position of Element in Sorted Array
     public static int [] searchRange(int arr[],int target)
     {
        int res[]=new int[2];
        int first=binarySearch(arr, target, true);
        int last=binarySearch(arr, target, false);
        res[0]=first;
        res[1]=last;
        return res;
     }

     //Find Floor of number
     /* note -->
      * Floor-- greatest value  equal to or smaller than target
      * ceil-- smaller value equal to or greatest tahn target
      */

      public static int  binarySearchFloor(int arr[],int target)
      {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=arr[mid];
                break;
                
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
                ans=arr[mid];
            }else
            {
                end=mid-1;
            }
        }
        return ans;
      }
     

       public static int  binarySearchCeil(int arr[],int target)
      {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=arr[mid];
                break;
                
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
               
            }else
            {
                end=mid-1;
                 ans=arr[mid];
            }
        }
        return ans;
      }
     
      //find minimum absolute  difference of element ( answer always is positive) 
    // if number is present then answer will be zero . 
    // target element ko sab element se minus karenge aur jo sabse minimum diffrence hoga woh answer hoga humara
   
   public static int findAbsoluteMinimumDif(int arr[], int target) {
    if (arr.length == 0) return -1; // Handle empty array case

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return 0; // If exact target found, difference is zero
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    // If target isn't found, find the closest element
    if (end < 0) return Math.abs(target - arr[start]); // Target is smaller than all elements
    if (start >= arr.length) return Math.abs(target - arr[end]); // Target is larger than all elements

    return Math.min(Math.abs(target - arr[start]), Math.abs(target - arr[end]));
}

//infinite array in sorted order and  find target
// here w e dont know our end 
public static int[] findRangeOfInfiniteArray(int arr[], int target)
{
     int range[]=new int[2];
     int start=0;
     int end=1;

     while (arr[end]<target) {
        start=end;
        end=2*end;

     }
     range[0]=start;
     range[1]=end;


    return range;
}

 public static int binarySearchInRange(int arr[], int target,int start,int end ) {
    if (arr.length == 0) return -1; // Handle empty array case

   int ans=-1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {

           ans=mid;
           break;
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return ans;
}
}
