class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long minPrefix = 0, maxPrefix = 0, prefixSum = 0;

        for (int diff : differences) {
            prefixSum += diff;
            minPrefix = Math.min(minPrefix, prefixSum);
            maxPrefix = Math.max(maxPrefix, prefixSum);
        }

        long validStartRange = (upper - maxPrefix) - (lower - minPrefix) + 1;
        return validStartRange > 0 ? (int) validStartRange : 0;
    }
}