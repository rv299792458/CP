import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;



public class Collecting_Packages {

  public static void sortByColumn(int arr[][])
  {
    Arrays.sort(arr, new Comparator<int[]>(){
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[0]==o2[0])
          return Integer.compare(o1[1],o2[1]);
        else
          return Integer.compare(o1[0],o2[0]);
      }
    });
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
      int n=Integer.parseInt(br.readLine());
      int arr[][]=new int[n][2];
      for(int i=0;i<n;++i)
      {
        String s1[]=br.readLine().trim().split(" ");

        arr[i][0]=Integer.parseInt(s1[0]);
        arr[i][1]=Integer.parseInt(s1[1]);
      }
      sortByColumn(arr);
      int x=0,y=0;
      boolean flag=true;
      StringBuilder ans=new StringBuilder() ;
      for(int i=0;i<n;++i)
      {
        int up=arr[i][1]-y;
        int right=arr[i][0]-x;
        if(up<0||right<0)
        {
          flag=false;
          break;
        }
        for(int j=0;j<right;++j)
          ans.append('R');
          for(int j=0;j<up;++j)
            ans.append('U');
       x=arr[i][0];
       y=arr[i][1];

      }
      if (flag) {
        System.out.println("YES" + '\n' + ans.toString());
      } else {
        System.out.println("NO");
      }
      //System.out.println();

    }

  }
}
