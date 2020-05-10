
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

class Alice_Bob_and_Candies {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t)
    {
      int n=Integer.parseInt(br.readLine());
      String s[]=br.readLine().trim().split(" ");
      Deque<Integer>dq=new LinkedList<Integer>();
      int suma=0,sumb=0,loops=0,totala=0,totalb=0;

      for(String s1:s)
      {
        dq.addLast(Integer.parseInt(s1));
      }
      while(dq.size()!=0)
      {
        while(suma<=sumb&&dq.size()!=0)
        {
          suma+=dq.pollFirst();
        }
        ++loops;
        totala+=suma;
        sumb=0;
        if(dq.size()==0)
          break;
        while(sumb<=suma&&dq.size()!=0)
        {
          sumb+=dq.pollLast();
        }
        ++loops;
        totalb+=sumb;
        suma=0;
      }
      System.out.println(loops+" "+totala+" "+totalb);
    }


  }
}


