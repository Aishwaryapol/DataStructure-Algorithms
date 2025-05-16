package com.dsa.day8;

public class SmallestDivOfThreshold {
   public static void main(String[] args) {
     int nums[]={ 1,2,5,9};
     int res=smallestDivisor(nums, 6);
     System.out.println(res);
   }

   public static int smallestDivisor( int[]nums , int threshold)
   {
    int start=1;
    int end=Integer.MIN_VALUE;
    // find the maximum possible divisior 

    for(int i=0;i<nums.length;i++)
    {
       if(nums[i]>end)
       {
         end=nums[i];
       }
    }

    int res=-1;
  while (start<=end) {
    int mid=start+(end-start)/2;

    if(isDivisiorPossible(nums,mid,threshold))
    {
        res=mid;
        end=mid-1;
    }else{
        start=mid+1;

    }
  }

    return res;
   }

   public static boolean isDivisiorPossible(int nums[],int divisior , int threshold)
   {
       int sumOfDivision=0;

       for(int i=0;i<nums.length;i++)
       {
         sumOfDivision+=nums[i]/divisior;
         if(nums[i]%divisior!=0)
         {
            sumOfDivision+=1;
         }

         if(sumOfDivision>threshold)
           return false;
       }
       return true;
   }
}
