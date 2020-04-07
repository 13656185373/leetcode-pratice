//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。 
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明： 
//
// 
// 所有输入均为小写字母。 
// 不考虑答案输出的顺序。 
// 
// Related Topics 哈希表 字符串


package leetcode.editor.cn;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Java：字母异位词分组
public class P49GroupAnagrams{
    public static void main(String[] args) {
        Solution solution = new P49GroupAnagrams().new Solution();
        String[] ss = {"eat", "tea", "tan", "ate", "nat", "bat"};
        solution.groupAnagrams(ss);
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String str : strs){
            String[] split = str.split("");
            Arrays.sort(split);
            String key = Arrays.toString(split);
            List<String> tmp = map.get(key);
            if (tmp == null){
                tmp = new ArrayList<>();
            }
            tmp.add(str);
            map.put(key,tmp);
        }
        for (List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}