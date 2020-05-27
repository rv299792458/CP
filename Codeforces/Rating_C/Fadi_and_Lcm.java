import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Comparator;
//import java.util.Deque;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;



public class Fadi_and_Lcm {

    static long gcd(long a,long b)
    {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //String s[] = br.readLine().trim().split(" ");
        long n=Long.parseLong(br.readLine());
        long min=Long.MAX_VALUE;
       for(int i=1;i<=Math.sqrt(n);++i)
       {
           if(n%i==0)
           {
               if(gcd(i,n/i)==1)
               {
                   if(Math.max(i,n/i)<min)
                       min=Math.max(i,n/i);
               }
           }
       }
        System.out.println(min+" "+n/min);
    }}






