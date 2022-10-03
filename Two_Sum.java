import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; 
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int numlength=nums.length;
        for(int i=0;i<numlength;i++){
            for(int j=i+1;j<numlength;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
           return res;
    }
}
