public class Merge {
    public static void sort(int[] nums,int start, int end) {
        if(start < end) {
            int mid = start + end >> 1;
            sort(nums, start, mid);
            sort(nums, mid + 1, end);
            merge(nums, start, end);
        }

    }

    public static void merge(int[] nums, int start, int end) {
        int[] tmp = new int[nums.length];
        int mid = start + end >> 1;
        int p1 = start;
        int p2 = mid + 1;
        int idx = start;
        while (p1 <= mid && p2 <= end) {
            if (nums[p1] < nums[p2]) {
                tmp[idx++] = nums[p1++];
            }else {
                tmp[idx++] = nums[p2++];
            }
        }
        while(p1 <= mid) tmp[idx++] = nums[p1++];
        while(p2 <= end) tmp[idx++] = nums[p2++];

        for (int i = start; i <= end; i++) {
            nums[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 7, 8, 2, 9, 6, 0, 5, 4 };
        sort(nums, 0, nums.length - 1);
        for (int num : nums)
            System.out.print(num + " ");

    }
}
