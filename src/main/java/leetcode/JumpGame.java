package leetcode;

public interface JumpGame {
    static boolean canJump(int[] nums) {
        var res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > res) {
                return false;
            }
            res = res > i + nums[i] ? res : i + nums[i];
        }
        return true;
    }
}
