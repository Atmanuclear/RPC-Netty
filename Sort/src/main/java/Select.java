public class Select {
    public static void sort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tmp;

        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 9, 5, 7, 0, 2, 4, 8};
        sort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
