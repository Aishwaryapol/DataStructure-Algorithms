package com.dsa.day3;

public class LinearSearch {
   public static void main(String[] args) {
      int arr[]={67,2,5,89,2,4,2,100,56};
      //linearSearch(arr, 100);
      // linearSearchMultiple(arr, 2);
      // findMax(arr);
     // findMin(arr);

     // 2d array 
     int numbers[][]={
            {1,3,5,7,3},
            {4,6,800,2,45},
            {56,7,1,3,5}

     };

   //  linearSearch2D(numbers, 800);

   findMaximumSumOfSubArray(numbers);
   }

   public static void linearSearch(int arr[],int target)
   {
    int ans=-1;
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]==target)
        {
                ans=1;
                break;
        }
     }

     if(ans==-1)
     {
        System.out.println("Element its not present into the array ");
     }
     else{
        System.out.println("Element its present into the array");
     }
   }

   public static void linearSearchMultiple(int arr[],int target)
   {
    int ans[]=new int[arr.length];
    int k=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            ans[k]=arr[i];
            k++;
        }
    }

    if(k==0)
    {
        System.out.println("Element its not present into the array");
    }
    else{
        System.out.println("Element Present Into the array ");
        /* 
        for(int i:ans)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        */

        for(int i=0;i<k;i++)
        {
            
            System.out.print(ans[i]+"  ");
        }
        System.out.println();
    }
   }

   public static void findMax(int arr[])
   {
    // int max=Integer.MIN_VALUE;
    int max=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(max<arr[i])
           max=arr[i];

    }
    System.out.println("Maximum Value is : "+max);
   }

   public static void findMin(int arr[])
   {
    // int max=Integer.MIN_VALUE;
    int min=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(min>arr[i])
           min=arr[i];

    }
    System.out.println("Minimum Value is : "+min);
   }

   public static void linearSearch2D(int arr[][],int target)
   {
        int outerIndex=-1;
        int innerIndex=-1;
        int k=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    System.out.println("Element Found ");
                    k=1;
                    return;
                }

            }
        }
        if(k==-1)
            System.out.println("Element not found");
   }

   public static void linearSearch2DMultiple(int arr[][],int target)
   {
    // its work only for normal array not jagged array 
    // int size=arr.length*arr[0].length;

    // its work both normal and jagged array 
    int size=0;
    for(int i=0;i<arr.length;i++)
    {
        size=size+arr[i].length;

    }

    int ans[][]=new int[size][2];
    int k=0;
   
       
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                   ans[k][0]=i;
                   ans[k][1]=j;
                   k++;
                }

            }
        }
        if(k==0)
            System.out.println("Element not found");

        else
        {
            for(int i=0;i<arr.length;i++)
            {
            System.out.println("element found at index : "+arr[i][0]+","+arr[i][1]);
            }
        }
   }

   public static void findMaximumSumOfSubArray(int arr[][])
   {
    int resIndex=-1;
    int max=0;
    for(int i=0;i<arr.length;i++)
    {
        int sum=0; 
        for(int j=0;j<arr[i].length;j++)
        {
            sum+=arr[i][j];
            resIndex=i;
        }

        if(max<sum)
        {
            max=sum;
        }
    }

    System.out.println(" Index is : "+resIndex +"  Maximum Sum of Sub Array : "+max);
   }
}
