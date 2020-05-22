
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class week1_6 {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    String s[]=br.readLine().trim().split(" ");
    int m=Integer.parseInt(br.readLine());
    Deque<Integer>dq=new LinkedList<>();
    StringBuilder ans=new StringBuilder();
    int arr[]=new int[n];

    for(int i=0;i<n;++i)
    {
      arr[i]=Integer.parseInt(s[i]);
    }

    for(int i=0;i<n;++i)
    {
      if(i<m)
      {
        while(!dq.isEmpty()&& arr[i]>=arr[dq.peekLast()])
          dq.removeLast();

        dq.addLast(i);
      }

      else
      {
        ans.append(arr[dq.peek()]+" ");
//        System.out.print(al.toString()+" ");
//        System.out.print(q.toString()+" ");
//        System.out.println();

        while ((!dq.isEmpty()) && dq.peek() <= i - m)
          dq.removeFirst();

       while(!dq.isEmpty()&& arr[i]>=arr[dq.peekLast()])
         dq.removeLast();
       dq.addLast(i);
      }

    }
    ans.append(arr[dq.peek()]+" ");
    System.out.println(ans);


    }

  }

