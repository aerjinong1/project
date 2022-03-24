public class Q3 {
    public int[] exchange(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 1) {
                res[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 == 0) {
                res[index++] = num;
            }
        }
        return res;
    }


    public int[] exchange_1(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            while (left <= right && nums[left] % 2 == 1)
                left++;
            while (left <= right && nums[right] % 2 == 0)
                right--;
            if (left > right)
                break;
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;
    }



        public int[] exchange_2(int[] nums) {
            int slow = 0, fast = 0;
            while(fast < nums.length){
                if(nums[fast] % 2 == 1){
                    int tmp = nums[slow];
                    nums[slow] = nums[fast];
                    nums[fast] = tmp;
                    slow++;
                }
                fast++;
            }
            return nums;
        }

}
