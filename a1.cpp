#include<bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
	long double a,b;
	long double ans;
	long long int c,n,pos=1;
	cin>>a>>b>>c;
	setprecision(30);
	ans=a/b;
	//loop
	while(1)
	{
		int d=int(ans);
		ans=ans-d;
		n=int(ans*10);
		if(n==c)
		{
			cout<<pos;
			break;		
		}
		else
		ans=(ans*10)-n;
		pos++;
	}
// cout<<"ans->"<<ans<<"d->"<<d<<"n->"<<n;
	return 0;
}

