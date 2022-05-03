public class QuickTemplete {
    public static void sort(int[] nums, int l, int r) {
        if(l >= r) return;
        int i = l  -1 ;
        int j = r + 1;
        int q = nums[l+r>>1];// l 可以   r不可以
        while (i < j) {
            do i++; while (nums[i] < q);
            do j--; while (nums[j] > q);
            if(i < j){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }

        sort(nums,l,j);
        sort(nums,j+1,r);

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,7,8,2,9,6,0,5,4};
        sort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}
