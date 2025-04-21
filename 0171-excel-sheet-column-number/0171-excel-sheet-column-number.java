class Solution {
    public int titleToNumber(String columnTitle) {
        int count=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char c=columnTitle.charAt(i);
            // if(c=='65' && c<='95')
            // return 1;
            // else
            count=count * 26 + (c - 'A' + 1);
        }
        return count;
    }
}
