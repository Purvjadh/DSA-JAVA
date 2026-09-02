package TwoPointer;


import java.util.Arrays;

public class TwoSum {

    public static boolean twoSum(int [] nums,int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return true;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args){

        int [] nums = {0,-1,2,-3,1};
        int target= -2;

        if(twoSum(nums,target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
