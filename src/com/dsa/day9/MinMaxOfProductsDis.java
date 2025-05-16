package com.dsa.day9;

public class MinMaxOfProductsDis {


  public static void main(String[] args) {
      int []quantities={11,6};
    int res=minimizedMaximum(6, quantities);
    System.out.println(res);
  }
    // Minimized Maximum of  products distributed to any store 
   public static  int minimizedMaximum(int n, int [] quantities)
   {
    int start=1; // to avoid divide by zero  errror
    int end=Integer.MIN_VALUE;  // for finding the max value 

    for(int i=0;i<quantities.length;i++)
    {
        if(quantities[i]>end)
        {
            end=quantities[i];
        }
    }
  int res=-1;
   while ((start<=end)) {
    int mid=start+(end-start)/2;
    if(isDistributionPossible(quantities,mid,n))
    {
        res=mid;
        end=mid-1;

    }
    else{
        start=mid+1;
    }
   }

   return res;
    
   }

   public static boolean isDistributionPossible(int quantities[], int maxProducts  ,int stores)
   {
    int storeCount=0;
    for(int i=0;i<quantities.length;i++)
    {
        storeCount+=quantities[i]/maxProducts;
        if(quantities[i]%maxProducts!=0)
        {
            storeCount+=1;

        }
        if(storeCount>stores)
        {
            return false;
        }
    }
    return true;
   }
}
