public class Bubble {
    public static void sort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++) {
                if(nums[j] > nums[j+1]){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> nums = new ArrayList<>();
//        while (sc.hasNext()) {
//            nums.add(sc.nextInt());
//        }
        int[] nums = new int[] { 1, 3, 7, 8, 2, 9, 6, 0, 5, 4 };
        sort(nums);
        for (int num : nums)
            System.out.print(num + " ");
    }
}
