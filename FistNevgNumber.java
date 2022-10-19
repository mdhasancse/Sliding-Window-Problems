import java.util.ArrayList;

public class FistNevgNumber  {
    public static void main(String[] args) {
        int [] arr = {12,-1,-7,8,-25,30,-18,-28};
        int start =0;
        int end=0;
        int k=3;


        ArrayList<Integer> list =new ArrayList<Integer>();

        while (end < arr.length)
        {
//            if given number is negative then add it into given list
            if(arr[end]<0)
            {
                list.add(arr[end]);
            }

            if((end - start +1)<k)
            {
                end++;
            }
            else if((end - start +1) == k)
            {
//                IF list is empty then print zero
                if(list.size()==0)
                {
                    System.out.println(0);
                }
                else
                {
                    if(arr[start]==list.get(0))
                    {
                        System.out.println(arr[start]);
                        list.remove(list.get(0));
                    }
                }

                start++;
                end++;
            }

        }
    }
    
}
