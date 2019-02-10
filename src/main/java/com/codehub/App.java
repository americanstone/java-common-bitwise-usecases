package com.codehub;

//https://github.com/keon/awesome-bits
//http://graphics.stanford.edu/~seander/bithacks.html

public class App 
{
  public static boolean isPowerOfTwo(int x){
	   return ((x & (x - 1)) == 0);
   }
}
