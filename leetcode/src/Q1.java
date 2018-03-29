import java.util.HashMap;

public class Q1 {

    // Q1. Two Sum
    public static int[] answers(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Q1. Solution
    public static int[] solution(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                return new int[] {
                        i, index
                };
            }
        }
        return null;
    }
}
