package TwoPointer;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSum(int arr[],int target){
        Arrays.sort(arr);
        int n = arr.length;
        int resultSum=arr[0] + arr[1]+arr[2];
        int minDifference= Integer.MAX_VALUE;

        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            int sum= arr[i] + arr[left] + arr[right];
            while(left < right){
                if(sum == target){
                    return target;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }

                int diffToTarget = Math.abs(sum - target);
               if(diffToTarget < minDifference){
                    minDifference=diffToTarget;
                    resultSum=sum;
               }
            }


        }
        return resultSum;
    }
    public static void main(String[] args){
         int[] arr={-1,2,1,-4};
         int target = 1;
         int result=threeSum(arr,target);
         System.out.print(result);

    }
}
