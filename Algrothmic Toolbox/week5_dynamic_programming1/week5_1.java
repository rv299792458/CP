import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import javafx.util.Pair;

//import java.io.File;

public class week5_1{
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n=Integer.parseInt(br.readLine());
  int arr[]=new int[n+1];
  if(n<=4)
  {
    int ans=1;
    if(n==0)
      ans=0;
    if(n==2)
      ans=2;
    System.out.println(ans);
    return;
  }
  arr[0]=0;
  arr[1]=1;
  arr[2]=2;
    arr[3]=1;
    arr[4]=1;
  for(int i=4;i<=n;++i)
  {
    arr[i]=Math.min(Math.min(arr[i-1],arr[i-3]),arr[i-4])+1;
  }
    System.out.println(arr[n]);

  }
}
