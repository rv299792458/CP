
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
////import javafx.util.Pair;

//import java.io.File;

public class week5_3{

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //ArrayList<Integer>al=new ArrayList<>();
    String b=br.readLine();
   String a=br.readLine();

   int n=a.length();
   int m=b.length();
   int arr[][]=new int[n+1][m+1];
    for(int i=1;i<=n;++i)
      arr[i][0]=i;
    for(int j=1;j<=m;++j )
      arr[0][j]=j;
   for(int i=1;i<=n;++i)
   {
     for(int j=1;j<=m;++j ){

       arr[i][j]=1+Math.min(Math.min(arr[i-1][j],arr[i][j-1]),arr[i-1][j-1]);
       if(a.charAt(i-1)==b.charAt(j-1))
       {
         arr[i][j]=Math.min(arr[i-1][j-1],arr[i][j]);
       }

     }

   }

    System.out.println(arr[n][m]);

  }
}
