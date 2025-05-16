package com.dsa.day1;

public class DsaForMaths {

    public static void main(String[] args) {
        //decimalToBinary(5);
      //  decimalToAnyBase(5, 2);
      // binaryToDecimal(5);
       //anyBaseToDecimal(101,2);
       findEvenOdd(7);
       reverseNumber(4567);
       power(10,6); 
       fastExponentiatian(2,3);
    }

   static void decimalToBinary(int decimalNum)
    {
        int resNum=0;
        int power=0;
        while(decimalNum>0)
        {
            int rem=decimalNum%2;
            decimalNum/=2;
            resNum+=rem*Math.pow(10, power);
            power++;

        }
        System.out.println("Result is "+resNum);
    }

    static void decimalToAnyBase(int decimalNum , int base)
    {
        int resultNum=0;
        int power=0;
        while(decimalNum>0)
        {
            int rem=decimalNum%base;
            decimalNum/=base;
            resultNum+=rem*Math.pow(10, power);
            power++;

           
        }
         System.out.println("Result is : "+resultNum);
    }

    static void binaryToDecimal(int binaryNumber)
    {
int resultNum=0;
        int power=0;
        while(binaryNumber>0)
        {
          int unitDigit=binaryNumber%10;
            
            resultNum+=unitDigit*Math.pow(2, power);
            binaryNumber/=10;
            power++;
         
           
        }
         System.out.println("Result is : "+resultNum);
    }

    static void anyBaseToDecimal(int number,int base)
    {
    int resultNum=0;
        int power=0;
        while(number>0)
        {
          int unitDigit=number%10;
            
            resultNum+=unitDigit*Math.pow(base, power);
            number/=10;
            power++;
         
           
        }
         System.out.println("Result is : "+resultNum);
    
    }

    static void findEvenOdd(int number)
    {
        if(number%2==0)
        {
            System.out.println("The Number is Even");

        }
        else{
            System.out.println("The Number is Odd");
        }
    }

    static void  reverseNumber(int number)
    {
        int reverse=0;
        while (number>0) {
            int rem=number%10;
            reverse=reverse*10+rem;
            number/=10;
        }
        System.out.println("Reverse Number is : "+reverse);
    }

    // calculate power of any number
    static double power(int number,int pow)
    {
        // we initialize 1 beacuse 0 multiply any number its become zero
        int resNum=1;
        for(int i=0;i<pow;i++)
        {
            resNum*=number;
        }
        System.out.println("power is "+resNum);
        return resNum;

    }

    //fastExponentiatian to calculate power in more efficient way
    static double fastExponentiatian(int number,int power)
    {
        double res=1;
        while (power>0) {
            if(power%2!=0)
            {
                res=res*number;
            }
            power/=2;
            number=number*number;

        }
      System.out.println(res);
        return res;
    }
}
