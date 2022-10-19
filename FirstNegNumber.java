import java.util.ArrayList;

public class FirstNegNumber {
    public static void main(String[] args) {
        int [] arr = {12,-1,-7,8,-25,30,-18,-28};
        int i =0;
        int j=0;
        int k=3;


        ArrayList<Integer> list =new ArrayList<Integer>();

        while (j < arr.length)
        {
//            if given number is negative then add it into given list
            if(arr[j]<0)
            {
                list.add(arr[j]);
            }

            if((j - i +1)<k)
            {
                j++;
            }
            else if((j - i +1) == k)
            {
//                IF list is empty then print zero
                if(list.size()==0)
                {
                    System.out.println(0);
                }
                else
                {
                    if(arr[i]==list.get(0))
                    {
                        System.out.println(arr[i]);
                        list.remove(list.get(0));
                    }
                }

                i++;
                j++;
            }

        }
    }
}
