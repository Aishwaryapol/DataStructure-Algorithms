package com.dsa.day6;

public class AllocateMinimumPages {
public static void main(String[] args) {
  int books[]={12,45,67,90};
  int res=allocateBooks(books, 3);
  System.out.println(res);

}

    public static int  allocateBooks(int []books , int students )
    {
        if(books.length<students)
        {
            return -1;
        }

        //find range will be  max of array and sum of array 
        int start=Integer.MIN_VALUE; // for finding max value 
        int end=0;// sum of array

        for(int i=0;i<books.length;i++)
        {
            if(books[i]>start)
            {
                start=books[i];
            }

            end=end+books[i];
        }

        int res=-1;
        while (start<=end) {
            // max pages that can be allocated to single student 
           int  mid=start+(end-start)/2;

           // if allocation is possible then minimize the number of pages
           if(isAllocationPossible(books,mid,students))
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
     static boolean isAllocationPossible(int []books , int maxPages ,int student)
     {
        int cuurentStudentCount=1;
        int pages=0;
        for(int i=0;i<books.length;i++)
        {
            pages+=books[i];
            // if pages exced max pages 
            if(pages>=maxPages)
            {
                // allocate to next student 
                cuurentStudentCount+=1;
                pages=books[i];
            }

            if(cuurentStudentCount>student)
            {
                return false;
            }
        }
            return true;
     }

     
}
