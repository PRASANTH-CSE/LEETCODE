class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int i=0;
        int j=n-1;
        for(i=0;i<n/2;i++,j--)
        {
                char t=s[j];
                s[j]=s[i];
                s[i]=t;
        }
        //System.out.println(Arrays.toString(s));
    }
}