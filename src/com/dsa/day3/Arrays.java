package com.dsa.day3;
import java.util.Scanner;
public class Arrays {
    
   public static void main(String[] args) {
     int age[]=new int[5];
   //  takeInputOfArray(age);
    // printArrayElement(age);
    // insert(age, 2, 569);
    // delete(age, 3);
    //  printArrayElement(age);
//   int arr[]={34,46,78,67,97};
//     boolean res=searchElement(arr, 67);
//     System.out.println(res);

  // MultiDimensional Array 
   int numbers[][]=new int[3][2];
//    takeInputOfMDA(numbers);
//    printMDA(numbers);

//  takeInputOfMDA(numbers);
//    insert2DArray(numbers, 1, 0, 1000);
//   printMDA(numbers);


//     takeInputOfMDA(numbers);
//     delete2DArray(numbers, 1, 1);
//   printMDA(numbers);
   }

   public static void takeInputOfArray(int arr[])
   {
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("Enter "+i+" Element : ");
         arr[i]=sc.nextInt();

    }
    sc.close();
   }

   public static void printArrayElement(int arr[])
   {
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("Array Element : "+arr[i]);
    }
    
   }

   public static void insert(int arr[] ,int pos , int element)
   {
    int size=arr.length;
    if(pos<0 || pos>size-1)
    {
        System.out.println("Invalid Position");
        return;
    }
    //shifting  towards the end
    for(int i=size-2;i>=pos;i--)
    {
        arr[i+1]=arr[i];

    }
    arr[pos]=element;
   }

   public static void delete(int arr[],int pos)
   {
      for(int i=pos;i<=arr.length-2;i++)
      {
        arr[i]=arr[i+1];
      }

      arr[arr.length-1]=0;
   }

   public static boolean searchElement(int arr[] ,int element)
   {
      boolean res=false;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==element)
        {
            res=true;
             break;
        }
      }
      
      return res;
   }

   // MultiDimensional Array 

   static void takeInputOfMDA(int numbers[][])
   {
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<numbers.length;i++)
    {
        for(int j=0;j<numbers[i].length;j++)
        {
                System.out.println("Enter "+i+" "+j+" Element : ");
                numbers[i][j]=sc.nextInt();

        }
    }
    sc.close();
   }
   public static void printMDA(int numbers[][])
   {
        for(int i=0;i<numbers.length;i++)
    {
        for(int j=0;j<numbers[i].length;j++)
        {  
             System.out.print( numbers[i][j]+"  ");
             System.out.println();
        }
   }
}

public static void insert2DArray(int arr[][],int iPOs ,int jPos,int element)
{
    insert(arr[iPOs], jPos, element);
}

public static void delete2DArray(int arr[][],int iPos,int jPos)
{
    delete(arr[iPos], jPos);
}

public static void update(int arr[],int pos,int element)
{
    if(pos<0 || pos>arr.length)
    {
        System.out.println("Invalid Position");
        return;

    }

    arr[pos]=element;
}

public static void updateMDA(int arr[][],int pos1,int pos2,int element)
{
    int size1=arr.length;
    if(pos1<0 || pos1>size1-1)
    {
        System.out.println("Invalid Position");
        return;

    }
  int size2=arr[pos1].length;
  if(pos2<0 || pos2>size2-1)
  {
  System.out.println("Invalid Position");
        return;
  }
    arr[pos1][pos2]=element;
}
}
