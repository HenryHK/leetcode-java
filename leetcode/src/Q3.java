public class Q3 {

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public static int solution(String s){
        /**
         * the basic idea is, keep a array which stores the characters in string as keys and their positions as values,
         * and keep two pointers which define the max substring. move the right pointer to scan through the string ,
         * and meanwhile update the array (which stores the number of its occurrences).
         *
         * If the character is already in the array, then move the left pointer forward.
         * Note that the two pointers can only move forward.
         */
        int[] count = new int[256];
        int maxLen = 0;

        for (int i=0, j=0; j<s.length(); ){
            if (count[s.charAt(j)]==0){
                count[s.charAt(j)]++;
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else {
                --count[s.charAt(i++)];
            }
        }

        return maxLen;
    }

    public static void main(String[] args){

    }
}
