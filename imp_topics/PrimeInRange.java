
/*Java program to find all primes within a range using Segmented Sieve concept*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimeInRange {
   static ArrayList<Integer>SimpleSieveResult=new ArrayList<>();
//  Simple Sieve method to find all the prime number Find all prime number
//  from 1 to Math.sqrt(Rigth limit of range )+1
//  and store them to  ArrayList SimplePrimeResult

    static void Sieve(int limit,int isPrime[]) {
      for(int i=4;i<=limit;i=i+2)
          isPrime[i]=1;
      isPrime[0]=1;
      isPrime[1]=1;


      //i=i+2 is an optimisation to skip all even numbers
      for(int i=3;i<=limit;i=i+2)
      {
            if(isPrime[i]==0)
            {
                for (int j = i*i; j <= limit; j += i)
                    isPrime[j]=1;
            }
      }
      /*If number is 1 then number is not prime, if 0 then it is prime*/
      for(int i=0;i<=limit;++i)
      {
          if(isPrime[i]==0)
            {
              //store all prime in arrayList
               SimpleSieveResult.add(i);
            }
      }



    }
    //this method is to find all prime number
     //in given range using ArrayList  SimpleSieveResult
    static  void SegmentedSieve(long left,long right,int segmentedPrime[])
    {
        for(int i=0;i<SimpleSieveResult.size();++i)
        {
          //base limit for finding multiples of prime
            long lowerLimit=(long)Math.ceil(1.0*left/SimpleSieveResult.get(i)) *SimpleSieveResult.get(i);
            for(long j=lowerLimit;j<=right;j+=SimpleSieveResult.get(i))
            {
              // System.out.println((int)(j-left)+" "+lowerLimit+" "+SimpleSieveResult.get(i));
                segmentedPrime[(int)(j-left)]=1;
            }
            if(lowerLimit==SimpleSieveResult.get(i))
                segmentedPrime[(int)(lowerLimit-left)]=0;

        }
    }

    /*Main method for the program */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[]=br.readLine().trim().split(" ");
        long n=Long.parseLong(s[0]);   // take  input lower limit
        long m=Long.parseLong(s[1]);   //take input upperlimit
        int limit=(int)Math.floor(Math.sqrt(m))+1;
        int isPrime[]=new int[limit+1];
        int segmentedPrime[]=new int[(int)(m-n+1)];
      //call simple sieve method
        Sieve(limit,isPrime);
      //call Segmented sieve method
        SegmentedSieve(n,m,segmentedPrime);
      // counter if you want to  count prime numbers
        int count=0;
        for(int j=0;j<=m-n;++j)
        {
            if (segmentedPrime[j] == 0) {
                ++count;
                System.out.print((j+n)+" ");
            }
        }

      //  System.out.println(count);
      //  to count number of primes if wanted


    }}






