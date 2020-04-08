//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 示例: 
//
// 输入："23"
//输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
// 
//
// 说明: 
//尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。 
// Related Topics 字符串 回溯算法


package leetcode.editor.cn;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Java：电话号码的字母组合
public class P17LetterCombinationsOfAPhoneNumber{
    public static void main(String[] args) {
        Solution solution = new P17LetterCombinationsOfAPhoneNumber().new Solution();
        System.out.println(solution.letterCombinations("23"));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> result = new ArrayList<>();
    HashMap<Integer,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1){
            return result;
        }
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        combinations("",digits);
        return result;

    }

    private void combinations(String s, String digits) {
        if (digits == null || digits.length() <1){
            result.add(s);
            return;
        }
        Integer tmp = Integer.valueOf(digits.substring(0,1));
        String[] values = map.get(tmp).split("");
        for (String ch : values){
            combinations(s+ch,digits.substring(1));
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}