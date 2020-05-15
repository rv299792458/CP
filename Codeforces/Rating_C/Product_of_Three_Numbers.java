import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;



public class Product_of_Three_Numbers {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Boolean> hm = new HashMap<>();
    StringBuilder answer=new StringBuilder();
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
     long n= Long.parseLong(br.readLine());
     int k= (int) Math.sqrt(n)+1;
     boolean flag=true;
     boolean prime=true;
     StringBuilder ans=new StringBuilder();
     long rem=0;
     int i=2;

     for(;i<=k;++i)
     {
       if(n%i==0)
       {
         prime=false;
         if(i==n/i)
         {
           flag=false;
           break;
         }
         else
         {

           ans.append(i+" ");
           rem=n/i;
           break;
         }
       }
     }
     if(prime)
     flag=false;
     if(flag)
     {
       int k1= (int) Math.sqrt(rem)+1;
       flag=false;
       for(int j=i+1;j<=k1;++j)
       {
         if(rem%j==0)
         {
           if(j==rem/j||rem/j==i)
           {
            // flag=false;
             break;
           }
           else
           {
             flag=true;
             ans.append(j+" "+rem/j);
             break;
           }
         }
       }
     }
      if (flag) {
        answer.append("YES"+'\n'+ans+'\n');

      } else {
        answer.append("NO"+'\n');
        //System.out.println("NO");
      }


    }
    System.out.println(answer);
  }
}
