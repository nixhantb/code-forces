public class LongestPalindromicSubstring {

    static String longestPalindrome(String s) {

        if(s.length()==0 || s == null){
            return "";
        }
        String longest = "";
        for(int i=0; i < s.length(); i++){

            
            String odd = aroundCenter(s, i, i);
            String even = aroundCenter(s, i, i+1);

            if(odd.length() > longest.length()){
                longest = odd;
            }
            if(even.length() > longest.length()){
                longest = even;
            }
        }
        return longest;
        
    }

    static String aroundCenter(String str, int left, int right) {

            while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)){
                left--;
                right++;
            }
            return str.substring(left+1, right);

    }

    public static void main(String[] args) {
        String a = "abbc";
        System.out.println(longestPalindrome(a));
      
    }
}