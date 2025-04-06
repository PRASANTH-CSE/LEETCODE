class Solution {
    public int climbStairs(int n) {
        if(n<=2)
        return n;
        int f=1;
        int s=2;
        for(int i=1;i<=n-2;i++)
        {
            int t=f+s;
            f=s;
            s=t;
        }
        return s;
    }
}