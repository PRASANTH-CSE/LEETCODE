class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for(int n:nums1)
        {
            set.add(n);
        }
        HashSet <Integer> s1=new HashSet<>();
        for(int j:nums2)
        {
            if(set.contains(j))
            s1.add(j);
        }
        int res[]=new int[s1.size()];
        int ind=0;
        for(int val:s1)
        {
            res[ind++]=val;
        }
        return res;
    }
}