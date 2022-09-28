public class Maximum_Sum_Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int l = arr.length;
        int k = 4; // widow size
        System.out.println(MaximumSumSubarray(arr,l,k));

    }

    static int MaximumSumSubarray(int[] arr, int l, int k)
    {
        int i=0;
        int j =0;
        int mx = 0;
        int sum = mx;
        
        while(j<l)
        {
            sum = sum+arr[j];
            
            if (j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                mx = Math.max(mx,sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return mx;
    }
}
