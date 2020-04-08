//给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字母的最小子串。 
//
// 示例： 
//
// 输入: S = "ADOBECODEBANC", T = "ABC"
//输出: "BANC" 
//
// 说明： 
//
// 
// 如果 S 中不存这样的子串，则返回空字符串 ""。 
// 如果 S 中存在这样的子串，我们保证它是唯一的答案。 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window


package leetcode.editor.cn;

import java.util.HashMap;

//Java：最小覆盖子串
public class P76MinimumWindowSubstring{
    public static void main(String[] args) {
        Solution solution = new P76MinimumWindowSubstring().new Solution();
        String S = "ADOBECODEBANC";
        String T = "ABC";
        System.out.println(solution.minWindow(S,T));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        String[] tSplit = t.split("");

        String better = "";
        int size = Integer.MAX_VALUE;
        int left = 0,right = 0;
        while (right<s.length()){
            if (right - left >= t.length()){
                String tmp = s.substring(left,right);
                boolean result = true;
                for (String ch : tSplit){
                    if (!tmp.contains(ch)){
                        result = false;
                        break;
                    }
                }
                if (result == true){
                    if (tmp.length()<size){
                        System.out.println(tmp);
                        size = tmp.length();
                        better = tmp;
                        left++;
                    }
                }
            }
            right++;
        }
        return better;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}