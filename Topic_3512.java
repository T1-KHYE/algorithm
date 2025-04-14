import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic_3512 {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int sum = getSum(nums);
        if (sum % k == 0) return 0;
        while (sum % k != 0) {
            count++;
            sum--;
        }
        return count;
    }

    //返回数组之和
    public int getSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Topic_3512().minOperations(new int[]{3, 9, 7}, 5));
    }
}
