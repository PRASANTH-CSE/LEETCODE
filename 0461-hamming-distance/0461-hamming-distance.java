class Solution {
    public int hammingDistance(int x, int y) {
        int h=x^y;
        return Integer.bitCount(h);
    }
}