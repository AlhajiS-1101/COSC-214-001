import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int value = nums.length - k;

        return nums[value];
    
    }
