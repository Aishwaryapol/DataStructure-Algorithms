package com.dsa.day5;

public class BSearchOnSortedRotatedArr {
  public static void main(String[] args) {
    //sorted rotated array
   int []arr={4,5,6,7,3,2,1,0};
   int []arr2={19,5,19,19,3,2,1,19};

   int res=search(arr, 6);
   System.out.println(res);
  
  System.out.println(searchWithDuplicate(arr2, 5));
  }
   public static int search(int arr[],int target)
   {
    int start=0;
    int end=arr.length-1;
    int ans=-1;
    while (start<=end) {
        int mid=start+(end-start)/2;

        if(target==arr[mid])
        {
            return mid;
        }

        // left side is sorted
        if(arr[start]<=arr[mid])
        {
            // can ans be found in left side ? 

            if(target>=arr[start] && target <arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        //right array  is sorted 
        else{
            // can ans be found in right side ?
            if(target>arr[mid] && target<=arr[end])
            {
                 start=mid+1;
            }
             
              else
              {
                end=mid-1;
              }
        }

    }
    return ans;
   }

   //search element (but in array also duplicated elements are exist .)
    public static boolean searchWithDuplicate(int arr[],int target)
   {
    int start=0;
    int end=arr.length-1;
    boolean ans=false;
    while (start<=end) {
        int mid=start+(end-start)/2;

        if(target==arr[mid])
        {
            return true;
        }

        // if start ,mid , ed all are same then we cant  guarantee which 
        // part is sorted so we will trim down the space 
        if(arr[start]==arr[mid] && arr[mid]== arr[end])
        {
            start++;
            end--;
        }

        // left side is sorted
        if(arr[start]<=arr[mid])
        {
            // can ans be found in left side ? 

            if(target>=arr[start] && target <arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        //right array  is sorted 
        else{
            // can ans be found in right side ?
            if(target>arr[mid] && target<=arr[end])
            {
                 start=mid+1;
            }
             
              else
              {
                end=mid-1;
              }
        }

    }
    return ans;
   }
 
   //find a minimum element in rotated sorted arrray 
   public static int findMin(int arr[])
   {
    int n=arr.length;
  int start=0;
  int end=n-1;
  int minElement=Integer.MAX_VALUE;

  while (start<=end) {
    int mid=start+(end-start)/2;
    if(arr[start]<=arr[mid])
    {
        minElement=Math.min(minElement, arr[start]);
        start=mid+1;
    }
     else{
          minElement=Math.min(minElement, arr[mid]);
        end=mid-1;
     }
  }
  return minElement;
   }

}
