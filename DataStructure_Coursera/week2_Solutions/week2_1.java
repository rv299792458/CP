
import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
import java.util.ArrayList;

public class week2_1 {
  static ArrayList<String>al=new ArrayList<>();
  public void buildHeap(int arr[],int n)
  {
    int startingIndex=n/2-1;
    for(int i=startingIndex;i>=0;--i)
    {
      heapify(arr,n,i);
    }
  }
  public  void heapify(int arr[],int n,int i)
  {
    int min=i;
    int l=2*i+1;
    int r=2*i+2;
    //System.out.println(arr[min]+" "+arr[l]+" "+arr[r]);
    if(l<n&&arr[l]<arr[min])
      min=l;
    if(r<n&&arr[r]<arr[min])
    min=r;

    if(min!=i)
    {
      int temp=arr[i];
      arr[i]=arr[min];
      arr[min]=temp;
      //System.out.println("l");
      al.add(i+" "+min);
      heapify(arr,n,min);
    }
  }


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    week2_1 obj=new week2_1();
    int n = Integer.parseInt(br.readLine());
    String s[]= br.readLine().trim().split(" ");
    int arr[]=new int [n];
    int i=0;
    for(String s1:s)
    {
      arr[i]=Integer.parseInt(s1);
      ++i;
    }

    obj.buildHeap(arr,n);
    if(al.size()==0)
    {
      System.out.println(0);
      return;
    }
    int size=al.size();
    System.out.println(size);
    for (i = 0; i < size; ++i) {
      System.out.println(al.get(i));
    }


    }
  }


