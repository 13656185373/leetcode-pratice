//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 
//
// 示例: 
//
// s = "abaccdeff"
//返回 "b"
//
//s = "" 
//返回 " "
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 哈希表


package leetcode.editor.cn;

import java.util.LinkedHashMap;
import java.util.Map;

//Java：第一个只出现一次的字符
public class P面试题50DiYiGeZhiChuXianYiCiDeZiFuLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题50DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
        System.out.println(solution.firstUniqChar("cc"));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {
        if (s == null || "".equals(s.trim())) {
            return ' ';
        }
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.get(ch) == null){
                map.put(ch,1);
            }else {
                map.put(ch,map.get(ch) + 1);
            }
        }
        Character ch = ' ';
        for (Map.Entry<Character,Integer> tmp : map.entrySet()){
            if (tmp.getValue() == 1){
                ch = tmp.getKey();
                break;
            }
        }
        return ch;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}