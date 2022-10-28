import java.util.HashMap;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println( UniqueLongestSubstring(s));
        
    }
    static int UniqueLongestSubstring(String s) {
        int len = s.length();
        int answer=-1,i=0,j=0;
        HashMap<Character,Integer> HM = new HashMap<>();
        
        if (s.isEmpty()) 
        {
            return 0;
        }
        while (j<len)
        {
            
            char ch = s.charAt(j);
           
            int chFrequencyInMap =   HM.getOrDefault(ch,0);
            HM.put(ch, chFrequencyInMap+1); //increase the frequency of current character in Map
            if (HM.size()< j-i+1)
            {
                while(HM.size()< j-i+1)
                {
                    char iChar = s.charAt(i);
                    int freqiChar = HM.get(iChar);
                    HM.put(iChar, freqiChar-1);
                    if (HM.get(iChar)==0)
                    HM.remove(iChar);
                    i++;
                }
            }
            if(HM.size() == j-i+1) //unique chars = k , compute candidate answer.
            {
                int currentAns = j-i+1;
                answer = Math.max(answer,currentAns);
            }

            j++; // increase window size and look for next window where sum = target
        }
        return answer;
            
    }
}
