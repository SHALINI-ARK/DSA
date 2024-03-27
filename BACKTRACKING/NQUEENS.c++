#include<bits/stdc++.h>
void solve(int col,vector<string>&bo,vector<vector<string>> &res , vector<int> &le,vector<int> &up,vector<int> &dow,int n)
{
    if(col==n)
    {
        res.push_back(bo);
        return;
    }
    for(int row=0;row<n;row++)
    {
        if(le[row]==0 && up[n-1+row-col]==0 && dow[row+col]==0)
        {
            bo[row][col]='Q';
            le[row]=1;
            up[n-1+row-col]=1;
            dow[row+col]=1;
            solve(col+1,bo,res,le,up,dow,n);
             bo[row][col]='.';
            le[row]=0;
            up[n-1+row-col]=0;
            dow[row+col]=0;
        }
    }
}
vector<vector<string> > Solution::solveNQueens(int n) {
   vector<vector<string>>res;
   vector<string> bo(n);
   string s(n,'.');
   for(int i=0;i<n;i++)
   {
       bo[i]=s;
   }
   vector<int> le(n,0),up(2*n-1,0),dow(2*n-1,0);
   solve(0,bo,res,le,up,dow,n);
   return res;
}
