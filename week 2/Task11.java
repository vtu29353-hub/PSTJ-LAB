public class Task11 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < nums.length; i++) {
            int randomIndex = (int) (Math.random() * nums.length);
            int temp = nums[i];
            nums[i] = nums[randomIndex];
            nums[randomIndex] = temp;
        }
        System.out.print("Shuffled Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
