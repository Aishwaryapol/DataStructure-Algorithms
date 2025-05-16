package com.dsa.day1;

import java.util.Arrays;

public class DsaForMaths2 {
    public static void main(String[] args) {
        //countDigits(5647835);
        //countDigitsByLog(345);
       // arstrongNumberCheck(133);
      // checkPalindromNumber(1217);
       //printAllDevisiors(36);
       //checkPrimeNumber(7);
        seiveAlgorithm(40);
    }

    static void countDigits(int number)
    {
        if(number==0)
        {
            System.out.println(" The Number of Digits Are : " +1);
            return;
        }
       
        int count=0;
        while (number>0) {
            number/=10;
            count++;
        }
        System.out.println(" The Number of Digits Are : " +count);
    
  }

  // logarithm technique to count digits of number
  static void countDigitsByLog(int number)
  {
    int count=0;
     if(number==0)
     {
        System.out.println("count of Digits are : 1");
        return;// use return because hum nahi chahate niche ka code bhi execute ho

     }
     // not Math.log() function by default log e calculate karata hai.
    //count= (int)(Math.log(number)/Math.log(10))+1;
    count= (int)Math.log10(10)+1;
    System.out.println("count of Digits are : "+count);
  }

  static void arstrongNumberCheck(int number)
  {
    int res=0;
    int numberCopy=number;
   // first count digit of number 
   int count=(int)(Math.log(number)/Math.log(10))+1;
    while (numberCopy>0) {
        int rem=numberCopy%10;
        res+=(int)Math.pow(rem, count);
        numberCopy/=10;
    }

    System.out.println(number==res);
  }

  static void checkPalindromNumber(int number)
  {
    int numberCopy=number;
    int res=0;
    while (numberCopy>0) {
        int rem=numberCopy%10;
        res=res*10+rem;
        numberCopy/=10;
    }
    System.out.println(res==number);
  }
    
  static void printAllDevisiors(int number)
  {
    int counter=1;
    int sqroot=(int)Math.sqrt(number);
    while (counter<=sqroot) {
        if(number%counter==0)
        {
            System.out.println(counter+" is the devisior of : "+number);

            int otherNumber=number/counter;
            if(counter!=number)
              System.out.println(otherNumber+" is the devisior of : "+number);
            counter++;
        }
    }
  }

  static void checkPrimeNumber(int number)
  {
    int counter=2;
    int sqroot=(int)Math.sqrt(number);
    while(counter<=sqroot)
    {
        if(number%counter==0)
        {
            System.out.println("The Number is not Prime");
            return;
        }
        counter++;
    }
    System.out.println("The Number is Prime ");
  }

  // print 1 -- n number of prime numbers .
  static void seiveAlgorithm(int number)
  {
    boolean []arr=new boolean[number+1];
    int counter=2;

    // fill all array element initialy true .
    Arrays.fill(arr, true);

    while (counter<=number) {
        if(arr[counter]==true)
        {
            for(int factor=counter+counter; factor<=number; factor+=counter)
            {
                arr[factor]=false;
            }
        }
        counter++;
    }
    for(int i=2;i<=number;i++)
    {
        System.out.println(i+" number is "+arr[i]);
    }
  }

 
}
