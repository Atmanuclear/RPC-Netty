public class QuickSort {
    private static void sort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;
        int temp = nums[left];

        while (left < right) {
            while (left < right && nums[right] >= temp){
                right--;
            }
            nums[left] = nums[right];

            while(left < right && nums[left] <= temp){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = temp;

        sort(nums, start, left - 1);
        sort(nums,left+1,end);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,7,8,2,9,6,0,5,4};
        sort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}
