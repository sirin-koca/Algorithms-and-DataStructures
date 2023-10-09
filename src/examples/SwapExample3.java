package examples;

public class SwapExample3 {

    public static void main(String[] args) {
        int[] numbers = {5, 10};  // Let's use an array where numbers[0] is 'a' and numbers[1] is 'b'

        System.out.println("Before swapping: a = " + numbers[0] + ", b = " + numbers[1]);

        // Using the swap method
        swap(numbers);

        System.out.println("After swapping: a = " + numbers[0] + ", b = " + numbers[1]);
    }

    public static void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }
}
