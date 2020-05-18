import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;


public class Verse_For_Santa {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t1=Integer.parseInt(br.readLine());

    for(int t=0;t<t1;++t) {
      String []s1= br.readLine().trim().split(" ");
      int n=Integer.parseInt(s1[0]);
      long s=Long.parseLong(s1[1]);
      String []s2= br.readLine().trim().split(" ");
      long sum=0,max=Long.MIN_VALUE;
      int i=0,maxi=0;
      boolean flag=true;
      for(String k:s2)
      {
        long h=Long.parseLong(k);
        if(h>max)
        {max=h;
        maxi=i;
        }
        sum+=h;
        if(sum>s)
        {
          flag=false;
          break;
        }
        ++i;
      }
      if (flag) {
        System.out.println(0);
      } else {
        System.out.println(1+maxi);
      }


    }
    }


    }


