import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Comparator;
//import java.util.Deque;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.beans.binding.StringBinding;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Random;


public class Blocks {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int n=Integer.parseInt(br.readLine());
   String s=br.readLine();
   StringBuilder sb=new StringBuilder(s);
   StringBuilder answer=new StringBuilder();
   int ans=0;
   for(int i=0;i<n-1;++i)
   {
     char ch=sb.charAt(i);
     if(ch!='W')
     {
       ++ans;
       answer.append((i+1)+" ");
       if(sb.charAt(i+1)=='W')
         sb.replace(i,i+2,"WB");
       else
         sb.replace(i,i+2,"WW");
      // System.out.println(sb);
     }
   }
    if (sb.charAt(n - 1) == 'B') {
      if (n % 2 == 0) {
        System.out.println(-1);
      }
      else
      {
        System.out.println(ans+n/2);
        StringBuilder newindex=new StringBuilder();
        for(int i=1;i<n;i+=2)
          newindex.append(i+" ");
        System.out.println(answer.toString()+newindex);

      }
    }
    else
    {
      System.out.println(ans);
      System.out.println(answer);
    }
    }
    }






