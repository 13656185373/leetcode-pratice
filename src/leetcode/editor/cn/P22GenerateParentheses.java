//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。 
//
// 例如，给出 n = 3，生成结果为： 
//
// [
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
// 
// Related Topics 字符串 回溯算法


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Java：括号生成
public class P22GenerateParentheses{
    public static void main(String[] args) {
        Solution solution = new P22GenerateParentheses().new Solution();
        System.out.println(solution.generateParenthesis(4));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<String> result = new ArrayList<>();
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        public List<String> generateParenthesis(int n) {
            for (int i = 0; i < n; i++) {
                left.push("(");
                right.push(")");
            }
            backtrack("");
            return result;
        }

        private void backtrack(String s) {
            if (left.size() == 0 && right.size() == 0){
                result.add(s);
                return;
            }
            if (left.size() > 0 ){
                backtrack(s+left.pop());
                left.push("(");
            }
            if (right.size() > left.size()){
                backtrack(s+right.pop());
                right.push(")");
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}