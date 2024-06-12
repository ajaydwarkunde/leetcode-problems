package binarySearch;

public class BinarySearch{
    public static void main(String[] args) {

    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while ( start < end) {
            int mid = ( start + end ) / 2 ;
            if (target <= nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        if (target == nums[start]) return start;
        return -1;
    }
}
