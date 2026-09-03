package TwoPointer;

public class RemoveDuplicates {
    public static int removeDuplicates(int [] nums){
        int i = 0;
        int j = 1;
        int uniqueElements = 1;

        while(j < nums.length){
            if(nums[j] != nums[i]){
                nums[i+1]= nums[j];
                i++;
                j++;
                uniqueElements++;
            }else{
                j++;
            }
        }

        return uniqueElements;
    }

    public static void main(String[] args){
        int [] nums = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int newSize=removeDuplicates(nums);

        System.out.println("No. of unique elements in array = " + newSize);

        for(int i=0;i<newSize;i++){
            System.out.print(nums[i] + " ");
        }

    }
}
