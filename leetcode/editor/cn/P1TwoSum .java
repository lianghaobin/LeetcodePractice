//Given an array of integers nums and an integer target, return indices of the t
//wo numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may n
//ot use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 103 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// Only one valid answer exists. 
// 
// Related Topics 数组 哈希表 
// 👍 10866 👎 0


import java.util.Arrays;

//Java：Two Sum
class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        int[] test = new int[4];
        test[0] = 2;
        test[1] = 7;
        test[2] = 11;
        test[3] = 15;
        System.out.println(Arrays.toString(solution.twoSum(test,9)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] a = new int[2];
            for(int i = 0;i<nums.length;i++){
                for(int y = (i+1);y<nums.length;y++){
                    if(target == (nums[i]+nums[y])){
                        a[0]=i;
                        a[1]=y;
                    }
                }
            }
            return a;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
