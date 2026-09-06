package TwoPointer;

import java.util.Arrays;

//time complexity  = n log n
public class BruteForceSquareOfSortedArray {
    public static int[] squaredArray(int[] nums){
        int[] newArr = new int[nums.length];
        int k= 0;

        for(int i=0;i<nums.length;i++){
            newArr[k]=nums[i] * nums[i];
            k++;
        }

        Arrays.sort(newArr);

        return newArr;
    }

    public static void main(String[] args){
        int[] nums= {-4,-1,0,3,10};
        int [] resultArray = squaredArray(nums);

        System.out.print(Arrays.toString(resultArray));
    }
}
