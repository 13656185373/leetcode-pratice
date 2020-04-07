//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划

package leetcode.editor.cn;
//Java：Longest Palindromic Substring
public class P5LongestPalindromicSubstring{
    public static void main(String[] args) {
        Solution solution = new P5LongestPalindromicSubstring().new Solution();
        System.out.println(solution.longestPalindrome("000000000000000000000000"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    暴力
//    public String longestPalindrome(String s) {
//        String result = "";
//        int max = 0;
//        char[] charArray = s.toCharArray();
//        if (charArray.length<1){
//            return result;
//        }
//        result = String.valueOf(charArray[0]);
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = i+1; j < charArray.length; j++) {
//                if (charArray[i]==charArray[j]){
//                    String tmp = s.substring(i,j+1);
//                    if (isPalindrome(tmp) && tmp.length()>=max){
//                        max = tmp.length();
//                        result = tmp;
//                    }
//                }
//            }
//        }
//        return result;
//    }

    private boolean isPalindrome(String tmp) {
        StringBuffer sb=new StringBuffer(tmp);
        return tmp.equals(sb.reverse().toString());
    }


    private int lo,maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len<2){
            return s;
        }

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        return s.substring(lo,lo+maxLen);

    }

    private void extendPalindrome(String s, int l, int r) {
        while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if (maxLen<r-l-1){
            lo = l+1;
            maxLen=r-l-1;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}