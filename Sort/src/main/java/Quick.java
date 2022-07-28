public class Quick {
    public static void sort(int[] nums,int start, int end) {
        if(start >= end) return;
        int left = start;
        int right = end;
        int tmp = nums[left];
        while (left < right) {
            while(left < right && nums[right] >= tmp) right--;// 位置符合
            nums[left] = nums[right];// 位置不符：放到左边空位，并把自己当前位置空出
            while(left < right && nums[left] <= tmp) left++;// 位置符合
            nums[right] = nums[left];// 位置不符：放到右边空位，并把自己当前位置空出
        }
        nums[left] = tmp;// 退出while时,   left==right，这是个空位，把temp标记点的数放入

        // 递归：现在以left/right为边界，左边是比它小的，右边是比它大的
        sort(nums, start, left - 1);
        sort(nums, left + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 7, 8, 2, 9, 6, 0, 5, 4 };
        sort(nums, 0, nums.length - 1);
        for (int num : nums)
            System.out.print(num + " ");
    }
}
