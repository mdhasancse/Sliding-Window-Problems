import java.util.ArrayList;
import java.util.List;

public class missingVal {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> res = new ArrayList<Integer>();
        for( int i=0;i<nums.length; i++)
        {
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0)
                continue;
            // let multiply for  mark as a negetive number
            nums[index] *= -1;
        }
        
        for( int i=0;i<nums.length; i++)
        {
            // those number not mark negetive 
            if(nums[i] > 0)
                res.add(i+1);
        }
       return res;
        
    }
}
