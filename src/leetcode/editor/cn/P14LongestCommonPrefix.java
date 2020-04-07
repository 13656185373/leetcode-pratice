//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串

package leetcode.editor.cn;
//Java：Longest Common Prefix
public class P14LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new P14LongestCommonPrefix().new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0){
//            return "";
//        }
//        String pre = strs[0];
//        for (int i = 1; i < strs.length ; i++) {
//            while (!strs[i].startsWith(pre)){
//                pre = pre.substring(0,pre.length()-1);
//            }
//        }
//        return pre;
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        return longestCommonPrefix(strs,0,strs.length-1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r){
            return strs[r];
        }
        int mid = (l+r)/2;
        String leftPart = longestCommonPrefix(strs,l,mid);
        String rightPart = longestCommonPrefix(strs,mid+1,r);
        return commonPrefix(leftPart,rightPart);
    }

    private String commonPrefix(String leftPart, String rightPart) {
        while (!rightPart.startsWith(leftPart)){
            leftPart = leftPart.substring(0,leftPart.length()-1);
        }
        return leftPart;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}