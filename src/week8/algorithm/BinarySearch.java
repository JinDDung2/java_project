package week8.algorithm;

public class BinarySearch {
    public static int binary(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int result = 0;

        while (start <= end) {
            int mid = (start+end)/2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
            result = mid;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 6;
        int result = binary(nums, target);
        System.out.println("result = " + result);
    }
}
