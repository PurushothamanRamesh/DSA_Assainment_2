package Assainment_1;

public class code7 {
    public static  void moveZeroes(int[] nums) {
        int left = 0;         
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
       moveZeroes(nums);
        
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
