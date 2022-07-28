public class Insert {
    public static void sort(int[] nums) {
        int n = nums.length;
        int pos, cur;
        for (int i = 1; i < n; i++) {
            pos = i - 1;
            cur = nums[i];

            while (pos >= 0 && cur < nums[pos]) {
                //右移腾出空位
                nums[pos + 1] = nums[pos];
                pos --;
            }
            nums[pos+1] = cur;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 7, 8, 2, 9, 6, 0, 5, 4 };
        sort(nums);
        for (int num : nums)
            System.out.print(num + " ");
        }

}
