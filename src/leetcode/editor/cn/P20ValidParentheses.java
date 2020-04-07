//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Stack;

//Java：有效的括号
public class P20ValidParentheses{
    public static void main(String[] args) {
        Solution solution = new P20ValidParentheses().new Solution();
        String s = "((";
        System.out.println(solution.isValid(s));
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0){
            return true;
        }
        if (s.length()%2 == 1){
            return false;
        }
        HashMap<String,String> map = new HashMap<>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");

        String[] split = s.split("");
        Stack<String> stack = new Stack<>();
        boolean result = true;
        for (String str : split){
            if (map.get(str)!=null){
                //该符号是左括号，压入栈中
                stack.push(str);
            }else {
                //该括号是右括号，需要从栈中弹出一个做比较，没有或者不匹配报错返回
                if (stack.size() < 1 || !map.get(stack.pop()).equals(str)){
                    result = false;
                    break;
                }
            }
        }
        if (stack.size()>0){
            return false;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}