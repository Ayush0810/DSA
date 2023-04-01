

public class chocolate {
    public static void main(String[] args) {
            int nums[] = {1,2,3,4};
        for(int i =0; i<nums.length; i++){
            if(nums[i]==nums[0] || nums[i] == nums[nums.length-1]){
             nums[i] = nums[i+1]* nums[nums.length-1-i];
            }else {
                nums[i] = nums[i-1]* nums[nums.length-1-i];
            }
           
        }
    }
    



}
