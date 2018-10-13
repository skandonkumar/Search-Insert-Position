
public class Solution {
	public static int searchInsert(int[] nums, int target) {
		int j = 0;
		if(target < nums[j]) {
			return 0;
		}
		if(target > nums[nums.length-1])return nums.length;
        for(int i=0;i<nums.length;i++){
            if(target == nums[j]){
                return j;
            }
            j++;         
        }
        
        j=0;
        while(target > nums[j]) {
        	j++;
        }
        return j;
    }
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 2;
		int result = searchInsert(nums, target);
		System.out.println(result);

	}

}
