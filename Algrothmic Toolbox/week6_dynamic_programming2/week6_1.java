
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

public class week6_1{

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //ArrayList<Integer>al=new ArrayList<>();
    //String b=br.readLine();
   //String a=br.readLine();
    String s1[]=br.readLine().trim().split(" ");
    String s2[]=br.readLine().trim().split(" ");;
    int w=Integer.parseInt(s1[0]);
    int n=Integer.parseInt(s1[1]);
    int arr[]=new int[n];
    int dp[][]=new int[n+1][w+1];
    for (int i=0;i<n;++i)
      arr[i]=Integer.parseInt(s2[i]);

    for (int i=0;i<=n;++i)
      dp[i][0]=0;

    for (int i=0;i<=w;++i)
      dp[0][i]=0;

    for (int i=1;i<=n;++i)
    {
      for(int j=1;j<=w;++j)
      {
        if(arr[i-1]<=j)
        {
          dp[i][j]=Math.max(dp[i-1][j-arr[i-1]]+arr[i-1],dp[i-1][j]);
        }
        else
          dp[i][j]=dp[i-1][j];

      }}
    System.out.println(dp[n][w]);

  }
}
