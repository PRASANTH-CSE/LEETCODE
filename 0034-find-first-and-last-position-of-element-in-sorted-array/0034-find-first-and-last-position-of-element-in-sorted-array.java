class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==target)
            {
                if(arr[0]==-1)
                {
                    arr[0]=j;
                }
                arr[1]=j;
            }
        }
        return arr;
    }
}