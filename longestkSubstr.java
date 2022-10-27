import java.util.HashMap;

public class longestkSubstr {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(LongestSubstringWithKUniqueCharacters(s,k));
    }

    static int LongestSubstringWithKUniqueCharacters(String s, int k)
    {
        int len = s.length();
        int answer=-1,i=0,j=0;
        HashMap<Character,Integer> HM = new HashMap<>();// make Hash Map to store char and thier count
        while (j<len)
        {
            //Sliding window Calculations
            char ch = s.charAt(j);
            //get the frequency of ch from Map and then increase it by 1 in the map.
            int chFrequencyInMap =   HM.getOrDefault(ch,0);
            HM.put(ch, chFrequencyInMap+1); //increase the frequency of current character in Map
            if (HM.size()>k)
            {
                while(HM.size()>k)
                {
                    char iChar = s.charAt(i);
                    int freqiChar = HM.get(iChar);
                    HM.put(iChar, freqiChar-1);
                    if (HM.get(iChar)==0)
                    HM.remove(iChar);
                    i++;
                }
            }
            if(HM.size() == k) //unique chars = k , compute candidate answer.
            {
                int currentAns = j-i+1;
                answer = Math.max(answer,currentAns);
            }

            j++; // increase window size and look for next window where sum = target
        }
        return answer;
            
    }   
}
