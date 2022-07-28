public class Shell {
    public static void sort(int[] nums) {
        int n = nums.length;
        int gap = n / 2;
        while( gap > 0){
            for (int j = gap; j < n; j++) {
                int i = j;
                while (i >= gap && nums[i - gap] > nums[i]) {
                    int tmp = nums[i - gap];
                    nums[i - gap] = nums[i];
                    nums[i] = tmp;
                    i -= gap;
                }
            }
            gap /= 2;
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 7, 8, 2, 9, 6, 0, 5, 4 };
        sort(nums);
        for (int num : nums)  System.out.print(num + " ");

    }
}
