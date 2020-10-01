#include<bits/stdc++.h>
using namespace std; 


vector<int> fast_count_segments(vector<int> starts, vector<int> ends, vector<int> points)
{
  vector<int> cnt(points.size());
  vector<pair<int64_t, int64_t>> p(starts.size());
  for (size_t i = 0; i < starts.size(); i++) 
  {
    p[i].first=starts[i];
  }
  for (size_t i = 0; i < ends.size(); i++) 
  {
    p[i].second=ends[i];
  }
  for(auto x: p)
  {
    cout<<x.first<<","<<x.second<<"\n";
  }
  for(auto x:points)
  {
    int64_t c=0;
    for(auto v:p)
    {
      if(v.first<x and x<v.second)
      {
        c++;
      }
    }
    cnt.push_back(c);
  }
  return cnt;
}

/*vector<int> naive_count_segments(vector<int> starts, vector<int> ends, vector<int> points) {
  vector<int> cnt(points.size());
  for (size_t i = 0; i < points.size(); i++) {
    for (size_t j = 0; j < starts.size(); j++) {
      cnt[i] += starts[j] <= points[i] && points[i] <= ends[j];
    }
  }
  return cnt;
}*/

int main() {
  int n, m;
  std::cin >> n >> m;
  vector<int> starts(n), ends(n);
  for (size_t i = 0; i < starts.size(); i++) {
    std::cin >> starts[i] >> ends[i];
  }
  vector<int> points(m);
  for (size_t i = 0; i < points.size(); i++) {
    std::cin >> points[i];
  }
  //use fast_count_segments
  vector<int> cnt = fast_count_segments(starts, ends, points);
  for (size_t i = 0; i < cnt.size(); i++) {
    std::cout << cnt[i] << ' ';
  }
}
