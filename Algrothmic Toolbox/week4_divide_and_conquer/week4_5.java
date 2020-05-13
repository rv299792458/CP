
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week4_5 {

  private static int[] FcountSegmentation(int[] starts, int[] ends, int[] points) {
    int[] cnt = new int[points.length];
    //write your code here
    return cnt;
  }

  private static int[] countSegmentation(int[] starts, int[] ends, int[] points) {
    int[] cnt = new int[points.length];
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < starts.length; j++) {
        if (starts[j] <= points[i] && points[i] <= ends[j]) {
          cnt[i]++;
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) throws IOException {
    //Scanner scanner = new Scanner(System.in);
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int n, m;
    String snm[]=br.readLine().trim().split(" ");
    n = Integer.parseInt(snm[0]);
    m = Integer.parseInt(snm[1]);
    int[] starts = new int[n];
    int[] ends = new int[n];
    int[] points = new int[m];
    for (int i = 0; i < n; i++) {
      String sr[]=br.readLine().trim().split(" ");
      starts[i] = Integer.parseInt(sr[0]);
      ends[i] = Integer.parseInt(sr[1]);
    }
    String srw[]=br.readLine().trim().split(" ");
    for (int i = 0; i < m; i++) {
      points[i] = Integer.parseInt(srw[i]);
    }
    int[] cnt = countSegmentation(starts, ends, points);
    StringBuilder answer=new StringBuilder();
    for (int x : cnt) {

      answer.append(x+" ");
    }
    System.out.println(answer);
  }
}