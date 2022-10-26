import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Maximum_Window {
    public static void main(String[] args) {
       int[] nums = {1,3,-1,-3,5,3,6,7};
       int k=3;
       System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
    static int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        Deque<Integer> q = new LinkedList<>();
        
        int i = 0;
        int j = 0;
        
        while(j < nums.length){
            // calculation
            if(q.size() == 0){
                q.add(nums[j]);
            }
            else{
                while(q.size() > 0 && q.peekLast() < nums[j]){
                    q.removeLast();
                }
                q.add(nums[j]);
            }
            // now move j pointer
            if(j - i + 1 < k) j++;
            // if we hit the window size
            else if(j - i + 1 == k){
                // answer -> calculation;
                ans[i] = q.peek();
                // slide the windowcalculation
                if(nums[i] == q.peek()){
                    q.removeFirst();
                }
                // now slide the pointer
                i++;
                j++;
            }
        }
        return ans;
        
    }
}
