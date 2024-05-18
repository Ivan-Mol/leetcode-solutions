package codewars;

public interface HighestAndLowest {
    static String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) < min) {
                min = Integer.parseInt(nums[i]);
            }
            if (Integer.parseInt(nums[i]) > max) {
                max = Integer.parseInt(nums[i]);
            }
        }
        return max + " " + min;
    }
}
