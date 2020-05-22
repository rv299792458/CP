
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
////import javafx.util.Pair;

//import java.io.File;

public class week1_2 {

  public class Node{
    int data;
    Node left,right;
    public Node(int item)
    {
      data=item;
      left=right=null;
    }
  }
  Node root;

  week1_2()
  {
    root=null;
  }

  void insert(int item)
  {
    root=InsertRec(root,item);
  }

  Node InsertRec(Node root,int item)
  {
    if(root==null)
    {
      root=new Node(item);
      return root;
    }
    if(item<root.data)
    {
      root.left=InsertRec(root.left,item);
    }
    else if(item>root.data)
    {
      root.right=InsertRec(root.right,item);
    }
    return root;
  }

  int MaxDepth(Node node)
  {
    if(node==null)
      return 0;
    else
    {
      int rd=MaxDepth(node.right);
      int ld=MaxDepth(node.left);
      if(rd>ld)
        return rd+1;
      else
        return ld+1;
    }
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    week1_2 tree=new week1_2();
    //ArrayList<Integer>al=new ArrayList<>();
    int n=Integer.parseInt(br.readLine());
    String s[]= br.readLine().trim().split(" ");
    for(String s1:s)
    {
      tree.insert(Integer.parseInt(s1));
    }
    System.out.println(tree.MaxDepth(tree.root));


  }
}
