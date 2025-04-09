class Solution {
    public double myPow(double x, int n) {
        if(n>0)
        {
            return Math.pow(x,n);
        }
        else
        {
            return 1/Math.pow(x,Math.abs((long)n));
        }
    }
}