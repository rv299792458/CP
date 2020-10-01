#include<bits/stdc++.h>
using namespace std;
int check(int a[],int s);

int main(int argc, char const *argv[])
{
	int t;
	cin>>t;
	while(t--)
		{
			int s,x;
			cin>>s;
			int arr[s];
			for (int i = 0; i < s; ++i)
			 {
			 	cin>>arr[i];
			 } 
			 x=check(arr,s);
			 if (x==1)
			 cout<<"YES";
			 else
			 cout<<"NO";
		}
	return 0;
}
int check(int arr[],int s)
{
	int diff=2048;
	sort(arr,arr+s,greater<int>());
			 for (int i = 0; i < s; i++)
			 {
			 	if(arr[i]<=2048)
			 	{
			 		diff=diff-arr[i];
			 		if(diff==0)
			 			return 1;
			 	}
			 
			 }

}

