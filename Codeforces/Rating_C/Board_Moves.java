import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;



public class Board_Moves {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Boolean> hm = new HashMap<>();

    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
      int n=Integer.parseInt(br.readLine());
      int loops=n/2;
      long size=3;
      long sum=0;
      for(int i=1;i<=loops;++i)
      {
        sum+=4*(size-1)*i;
        size+=2;
        // System.out.println(sum);
      }
      System.out.println(sum);
      // System.out.println();
    }
  }
}
