class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer in[]=new Integer[names.length];
        for(int i=0;i<names.length;i++)
        {
            in[i]=i;
        }
        Arrays.sort(in,(i,j)-> Integer.compare(heights[j],heights[i]));
        String res[]=new String[names.length];
        for(int i=0;i<names.length;i++)
        {
            res[i]=names[in[i]];
        }
        return res;
    }
}