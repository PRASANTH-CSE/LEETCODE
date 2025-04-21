class Solution {
    public int[] prisonAfterNDays(int[] c, int n) {
        int l=c.length;
        int a[]=new int[l];
        n=n%14==0?14:n%14;
        while(n!=0)
        {
            for(int i=1;i<l-1;i++)
            {
                if((c[i-1]==0 && c[i+1]==0) || (c[i-1]==1 && c[i+1]==1))
                a[i]=1;
                else
                a[i]=0;
            }
            c=a.clone();
            n--;
        }
        return c;
    }
}