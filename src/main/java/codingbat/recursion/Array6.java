package codingbat.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Array6 {

    /**
     * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering
     * only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to
     * move down the array. The initial call will pass in index as 0.
     */
    public static boolean array6(final int[] nums, final int index) {
        if (nums.length == 0 || nums.length == index) {
            return false;
        }

        return nums[index] == 6 || array6(nums, index + 1);
    }
}
