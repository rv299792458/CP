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


public class Orac_and_Models {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t=Integer.parseInt(br.readLine());
    for(int t1=0;t1<t;++t1)
    {
    // System.out.println("testcase");
      int n=Integer.parseInt(br.readLine());
      String s[]=br.readLine().trim().split(" ");
      ArrayList<Integer>al=new ArrayList<>();
      ArrayList<Integer>dp=new ArrayList<>();
      al.add(0);
      dp.add(0);
      int max=1;
      for(String ss:s)
      {al.add(Integer.parseInt(ss));
      dp.add(0);
        //System.out.println("EL");
      }
      for(int i=n;i>0;--i)
      {
        //System.out.println("for1");
        if(i>Math.ceil(n/2)) {
          dp.set(i, 1);
          //System.out.println("While1");
          continue;
        }
        int localmax=1;
        for(int j=2;j<=n;++j)
        {
         // System.out.println("pp");
          if(i*j>n)
            break;
          if(localmax<dp.get(i*j)+1&&al.get(i*j)>al.get(i))
            localmax=dp.get(i*j)+1;
        }
        dp.set(i,localmax);
        if(max<localmax)
          max=localmax;
      }
      System.out.println(max);

    }
    }
    }






