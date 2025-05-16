
package com.dsa.day2;
public class BitManupulation {
  public static void main(String[] args) {
    
 
  printOddEven(32);
  printBits(32);
 // int res=toggleIthBit(32, 2);
//  int res=setIthBit(32, 2);
 int res=unSetBit(32, 5);
  printBits(res);
  }

  static void printBits(int num)
  {
    // we assume our number is 8 bits 
    for(int i=7;i>=0;i--)
    {
        System.out.print((num>>i)&1);
       
    }
     System.out.println();
  }

  static void printOddEven(int num)
  {
   // agar last bit number ki 1 hoti hai toh woh odd hota hai agar zero huyi toh woh even hota hai .
 
    System.out.println(isBitSet(num,0)==true?"its odd number ":"its even number");
  }

  public static boolean isBitSet(int num,int bit)
  {
    //its function check i th bit its set or not .
     int res=num&(1<<bit);
    return  res==0?false:true;
  }

  //set i th bit forsefully if it is 0 then 1 if it is 1 then also 1.
  static int setIthBit(int num,int bit)
  {
    return num |(1<<bit);
  }

  //Toggle I th Bit
  static int toggleIthBit(int num,int bit)
  {
    return num ^(1<<bit);
  }

  static int unSetBit(int num,int bit)
  {
    return num& ~(1<<bit);
  }
}
