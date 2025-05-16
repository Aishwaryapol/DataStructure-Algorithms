package com.dsa.day1;

public class DsaForMaths3 {
    public static void main(String[] args) {
        
       // newtonRaphsonSqRoot(49);
     //  GCD(24,36);
      // GCD(0, 5);
    //  euclidianAlgorithm(24 , 36);
    //   efficiantEuclidianAlgorithm(24, 36);
    //  LCM(24,36);
    findFactorialOfNumber(5);
    }

   static void newtonRaphsonSqRoot(int number)
  {
    double tol=0.0001;
    double root;
    double x=number;

    while(true)
    {
        root=0.5*(x+(number/x));
        double ans=x-root;
        if(ans<tol)
        {
            break;
        }

        x=root;
    }
    System.out.println((int)root);
  }
//(find greatest common devisior) if 0 and n then n always GCD eg. 0 and 5 then 5 its GCD .
  static void GCD(int num1,int num2)
  {
      int min=num1<=num2?num1:num2;
     while(min>0)
     {
        if(num1%min==0 && num2%min==0)
        {
            System.out.println("The GCD Is : "+min);
            return;
        }
        min--;
     }
      int max=num1>=num2?num1:num2;
      System.out.println("The GCD is : "+max);
  }
  // Encludian Algorithm  to find GCD
  static void euclidianAlgorithm(int num1,int num2)
  {
     while (num1!=0 && num2!=0) {
        if(num1>num2)
            num1-=num2;
        else
            num2-=num1;
     }

     int res=num1;
     if(num1==0)
        res=num2;

    System.out.println("The GCD is :"+res);
  }

   // Encludian Algorithm  to find GCD
  static int efficiantEuclidianAlgorithm(int num1,int num2)
  {
     while (num1!=0 && num2!=0) {
        if(num1>num2)
            num1%=num2;
        else
            num2%=num1;
     }

     int res=num1;
     if(num1==0)
        res=num2;

   // System.out.println("The GCD is :"+res);
   return res;
  }

  // find Least Common Factor (method -- LCM(a,b)=(a*b)/GCD(a,b))
  static void LCM(int num1,int num2)
  {
    int res=(num1*num2)/efficiantEuclidianAlgorithm(num1, num2);
    System.out.println("The LCM is :"+res);
  }

  static void findFactorialOfNumber(int number)
  {
     double res=1;
     while (number>1) {
        res*=number;
        number--;
     }
     System.out.println("The Factorial is : "+res);
  }
}
