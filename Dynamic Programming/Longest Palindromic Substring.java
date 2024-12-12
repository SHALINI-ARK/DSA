import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
       boolean[][] dp = new boolean[n][n];
        int  MaxLen = 0, si = 0;
        for (int gap = 0; gap < n; gap++) 
        {
            for (int i = 0, j = gap; j < n; i++, j++) 
            {
                if (gap == 0)
                    dp[i][j] = true;
                else if (gap == 1 && s.charAt(i) == s.charAt(j))
                    dp[i][j] = true;
                else
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                if (dp[i][j]) 
                {
                    if (j - i + 1 > MaxLen) 
                    {
                        MaxLen = j - i + 1;
                        si = i;
                    }
                }
            }
        }
        return s.substring(si, si + MaxLen);
    }
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0)
      {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
      }
  }
}

//INPUTS 
3
3
aba
4 
abcd
6
abbacc

//OUTPUTS 
aba
a
abba
