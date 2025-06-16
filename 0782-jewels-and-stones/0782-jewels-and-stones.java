class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for(char c:jewels.toCharArray())
        {
            set.add(c);
        }
        int c=0;
        for(char ch:stones.toCharArray())
        {
            if(set.contains(ch))
            {
                c++;
            }
        }
        return c;
    }
}