package TwoPointer;

import java.util.Arrays;
//Time compklexity of this solution is o(n)
public class SquaresOfSortedArray {
    public static int[] squaredArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int[] newArr = new int[nums.length];
        int k= newArr.length - 1;

        while(start <= end){
            int start_ele = nums[start];
            int end_ele = nums[end];
            int start_square = start_ele * start_ele;
            int end_square = end_ele * end_ele;

            if(start_square > end_square){
                newArr[k]=start_square;
                k--;
                start++;
            }else{
                newArr[k]=end_square;
                k--;
                end--;
            }

        }

        return newArr;
    }

    public static void main(String[] args){
        int[] nums= {-4,-1,0,3,10};
        int [] resultArray = squaredArray(nums);

        System.out.print(Arrays.toString(resultArray));
    }
}
