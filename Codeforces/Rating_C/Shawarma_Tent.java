import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Comparator;
//import java.util.Deque;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Random;


public class Shawarma_Tent {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   // int n=Integer.parseInt(br.readLine());
    String s[]=br.readLine().trim().split(" ");
    int n=Integer.parseInt(s[0]);
    long x=Long.parseLong(s[1]);
    long y=Long.parseLong(s[2]);
    int up=0,d=0,l=0,r=0;
    for(int t=0;t<n;++t)
      {
       String s1[]=br.readLine().trim().split(" ");
       long x1=Long.parseLong(s1[0]);
        long y1=Long.parseLong(s1[1]);
        if(x1>x)
          ++r;
        if(x1<x)
          ++l;
        if(y1>y)
          ++up;
        if(y1<y)
          ++d;
      }
    int max=Math.max(Math.max(up,d),Math.max(r,l));
    System.out.println(max);
    if(max==l)
    {
      System.out.println((x-1)+" "+y);
      return;
    }

    if(max==r)
    {

      System.out.println((x+1)+" "+y);
      return;
    }  if(max==up)
    {
      System.out.println(x+" "+(y+1));
      return;
    }  if(max==d)
    {
      System.out.println(x+" "+(y-1));
      return;
    }
    }
    }






