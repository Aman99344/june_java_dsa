package July_16_2022;

import java.lang.annotation.Target;

public class leetCodeTwoSum {
    public static void main(String[] args) {
        int nums [] = {2,7,11,15,3};
        
        int target = 10;

        for(int i = 0; i<nums.length; i++){

            for(int j = i + 1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.print(i + " "+ j);
                }
            }
        }
    }
}
