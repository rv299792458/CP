#include<bits/stdc++.h>
using namespace std; 
#define ll long long
#define FASTER ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0)
using namespace std;
const int maxn = 1e5;
#define foreach(i,n) for(__typeof((n).begin())i =(n).begin();i!=(n).end();i++)
#define sgn(x,y) ((x)+eps<(y)?-1:((x)>eps+(y)?1:0))
#define rep(i,n) for(__typeof(n) i=0; i<(n); i++)
#define mem(x,val) memset((x),(val),sizeof(x));
#define rite freopen("output.txt","w",stdout)
#define read freopen("input.txt","r",stdin)
#define all(x) x.begin(),x.end()
#define sz(x) ((int)x.size())
#define sqr(x) ((x)*(x))
#define pb push_back
#define mp make_pair
#define clr clear()
#define inf (1<<30)
#define ins insert
#define xx first
#define yy second
#define eps 1e-9
#define chk(p) cout<<p<<"\n"
#define chkv(v) for(auto x:v){cout<<x<<" ";}cout<<"\n"
#define chkmp(mp) for(auto x:mp){cout<<x.first<<" "<<x.second<<"\n";}cout<<"\n"
#define intovec(v,n) for (int i = 0; i < n; ++i)cin>>v[i] //insert into vec v of size n
    


 
typedef long long i64;
typedef unsigned long long ui64;
typedef string st;
typedef vector<int> vi;
typedef vector<st> vs;
typedef map<int,int> mii;
typedef map<st,int> msi;
typedef set<int> si;
typedef set<st> ss;
typedef pair<int,int> pii;
typedef vector<pii> vpii;

//--------------end template
string linear_search(int arr[],int n,int x){
    
    if(n<0)
        return "NO";
    else if(n==0 and arr[n]!=x)
        return "NO";
    else if(arr[n]==x)
        return "YES";
    else
        return linear_search(arr,n-1,x);
    

}

int main(){
  
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; ++i)
    {
        cin>>arr[i];
    }
    int x;
    cin>>x;
    string ans;

    ans= linear_search(arr,n-1,x);
    cout<<ans;

}

        
    

    
