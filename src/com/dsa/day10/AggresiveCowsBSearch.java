package com.dsa.day10;

import java.util.Arrays;

public class AggresiveCowsBSearch {
  public static void main(String[] args) {
    int stalls[]={1,2,4,8,9};
      int res=solve(5, 3, stalls);
    
      System.out.println(res);
  }

    public static int solve(int n ,int cows , int []stalls)
    {
        if(stalls.length<cows)
        {
           return -1;
        }
  
        // sorting array 
        Arrays.sort(stalls);
    int start=1;
    int end=stalls[n-1]-stalls[0];
    int ans=-1;
   while (start<=end) {
     int mid=start+(end-start)/2;

     // if possible then increase the distance 
     if(isAllocationPossible(stalls,mid,cows)){
        ans=mid;
      start=mid+1;
      
     }
     else{
   end=mid-1;
     }
   }
   return ans;
    }

    public static boolean isAllocationPossible(int stalls[] , int minDistance, int cows){
        int cowsCount=1;
        int lastCountDist=stalls[0];
      for(int i=0;i<stalls.length;i++)
      {
        // checkif min distance is maintenced 
       // then increase count of cow and assign new location 
        if(stalls[i]-lastCountDist>=minDistance){
            cowsCount+=1;
            lastCountDist=stalls[i];

        }
        if(cowsCount>=cows)
        {
            return true;
        }
      }
      return false;

    }
}
