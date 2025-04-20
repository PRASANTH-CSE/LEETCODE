class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        } 
        List<Integer> l=new ArrayList<>(set);
        if(set.size()>=3)
        return l.get(set.size()-3);
        return l.get(set.size()-1);
    }
}