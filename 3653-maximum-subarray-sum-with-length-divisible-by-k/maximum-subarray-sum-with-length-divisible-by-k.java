import java.util.*;

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minPref = new long[k];
        
        Arrays.fill(minPref, Long.MAX_VALUE);
        
        long prefix = 0L;
        long ans = Long.MIN_VALUE;
        
        // prefix index 0 has sum = 0, remainder = 0
        minPref[0] = 0L;
        
        for (int idx = 1; idx <= n; idx++) {
            prefix += nums[idx - 1];
            
            int rem = idx % k;
            
            if (minPref[rem] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix - minPref[rem]);
            }
            
            minPref[rem] = Math.min(minPref[rem], prefix);
        }
        
        return ans;
    }
}
