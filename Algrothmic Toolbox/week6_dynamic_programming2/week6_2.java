
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
////import javafx.util.Pair;

//import java.io.File;

public class week6_2{

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //ArrayList<Integer>al=new ArrayList<>();
    //String b=br.readLine();
   //String a=br.readLine();
    int n= Integer.parseInt(br.readLine());
    String s1[]=br.readLine().trim().split(" ");
    int arr[]=new int[n];

    int sum=0;
    for(int i=0;i<n;++i)
    {
      arr[i]=Integer.parseInt(s1[i]);
    sum+=arr[i];
    }
    if(sum%3!=0)
    {
      System.out.println(0);
      return;
    }
    int s=sum/3;
    boolean dp[][]=new boolean[s+1][n+1];
    for (int i=0;i<=s;++i)
    {
      for(int j=0;j<=n;++j)
      {
        if(i==0)
        {dp[0][j]=true;
        continue;}
        if(j==0)
        {dp[i][0]=false;
        continue;}
        dp[i][j] = dp[i][j-1];
        if (i >= arr[j-1])
          dp[i][j] = dp[i][j] || dp[i - arr[j-1]][j-1];
          
      }
    }
//
//    for (int i=0;i<=s;++i) {
//      for (int j = 0; j <= n; ++j) {
//        System.out.print(dp[i][j]+" ");
//      }
//      System.out.println();
//    }
    int i=s;
    int j=n;
    ArrayList<Integer>al=new ArrayList<>();
    ArrayList<Integer>al1=new ArrayList<>();



    while(i>0 &&j>=0)
    {
      if(dp[i][j-1]==true)
      {
        --j;
      }
      else
      {i=i-arr[j-1];
      arr[j-1]=-1;
      al1.add(arr[j-1]);--j;}
    }
    for(int k:arr)
    {
      if(k!=-1)
        al.add(k);
    }

    boolean dp2[][]=new boolean[s+1][al.size()+1];
    for (int i1=0;i1<=s;++i1)
    {
      for(int j1=0;j1<=al.size();++j1)
      {
        if(i1==0)
        {dp2[0][j1]=true;
          continue;}
        if(j1==0)
        {dp2[i1][0]=false;
          continue;}
        dp2[i1][j1] = dp2[i1][j1-1];
        if (i1 >= al.get(j1-1))
          dp2[i1][j1] = dp2[i1][j1] || dp2[i1 - al.get(j1-1)][j1-1];

      }
    }
    if (dp2[s][al.size()] == true) {
      System.out.println(1);

    } else {
      System.out.println(0);
    }




  }
}
