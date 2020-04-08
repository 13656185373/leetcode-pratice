//给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。 
//
// 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。 
//
// 说明： 
//
// 
// 字母异位词指字母相同，但排列不同的字符串。 
// 不考虑答案输出的顺序。 
// 
//
// 示例 1: 
//
// 
//输入:
//s: "cbaebabacd" p: "abc"
//
//输出:
//[0, 6]
//
//解释:
//起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
//起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
// 
//
// 示例 2: 
//
// 
//输入:
//s: "abab" p: "ab"
//
//输出:
//[0, 1, 2]
//
//解释:
//起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
//起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
//起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
// 
// Related Topics 哈希表


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：找到字符串中所有字母异位词
public class P438FindAllAnagramsInAString{
    public static void main(String[] args) {
        Solution solution = new P438FindAllAnagramsInAString().new Solution();
        System.out.println(solution.findAnagrams("abab","ab"));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        String[] split =s.split("");
        String[] target = p.split("");
        Arrays.sort(target);
        String tergetStr = Arrays.toString(target);
        int left = 0;
        for (int right = left+p.length()-1; right < split.length; right++) {
            String[] tmp =new String[p.length()];
            int begin = left;
            for (int i = 0; i < p.length(); i++) {
                tmp[i] = split[begin];
                begin++;
            }
            Arrays.sort(tmp);
            if (Arrays.toString(tmp).equals(tergetStr)){
                result.add(left);
            }
            left++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}