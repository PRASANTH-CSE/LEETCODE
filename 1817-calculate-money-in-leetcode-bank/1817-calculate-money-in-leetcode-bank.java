class Solution {
    public int totalMoney(int n) {
        int w=n/7;
        int d=n%7;
        int t=((w*(w-1))/2)*7;
        t+=w*28;
        t+=((d*(d+1))/2)+(w*d);
        return t;
    }
}