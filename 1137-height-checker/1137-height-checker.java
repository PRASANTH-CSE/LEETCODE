class Solution {
    public int heightChecker(int[] heights) {
        int ini[]=heights.clone();
        Arrays.sort(ini);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=ini[i])
            c++;
        }
        return c;
    }
}