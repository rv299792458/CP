
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class week5_LCS3{

  private static int lcs3(int[] a, int[] b, int[] c) {
    //Write your code here
    int A = a.length;
    int B = b.length;
    int C = c.length;

    int[][][] res = new int[A+1][B+1][C+1];
    for (int i = 1; i <= A; i++) {
      for (int j = 1; j <= B; j++) {
        for (int k = 1; k <= C; k++) {
          if(a[i-1]==b[j-1] && b[j-1]==c[k-1]){
            res[i][j][k] = res[i-1][j-1][k-1]+1;
          } else {
            res[i][j][k] = Math.max(res[i-1][j][k], Math.max(res[i][j-1][k], res[i][j][k-1]));
          }
        }
      }
    }
    return res[A][B][C];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int an = Integer.parseInt(br.readLine());
    String saa[]=br.readLine().trim().split(" ");
    int[] a = new int[an];
    for (int i = 0; i < an; i++) {
      a[i] = Integer.parseInt(saa[i]);
    }
    int bn = Integer.parseInt(br.readLine());
    String sbb[]=br.readLine().trim().split(" ");
    int[] b = new int[bn];
    for (int i = 0; i < bn; i++) {
      b[i] = Integer.parseInt(sbb[i]);
    }
    int cn = Integer.parseInt(br.readLine());
    String scc[]=br.readLine().trim().split(" ");
    int[] c = new int[cn];
    for (int i = 0; i < cn; i++) {
      c[i] =Integer.parseInt(scc[i]);
    }
    System.out.println(lcs3(a, b, c));
  }

  private static void print(int[][] a){
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}