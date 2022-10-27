import java.util.Arrays;

public class largest_subArray {
    public static void main(String[] args) {
        int[] nums= {4,1,1,1,2,3};
        int k=5;
        System.out.println(subarraySum(nums,k));
    }
    static int subarraySum(int[] nums, int k) {
        long sum=0;
        int i=0;
        int j=0;
        int max = 0;
        while(j < nums.length)
        {
            sum=sum+nums[j];
            if(sum < k)
                j++;
            if(sum == k)
            {
                if (j-i+1 > max)
                    max=j-i+1;
                j++;
            }
            
            if(sum > k)
            {
                while(sum > k)
                {
                    sum = sum-nums[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
