//给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。 
//
// 你可以对一个单词进行如下三种操作： 
//
// 
// 插入一个字符 
// 删除一个字符 
// 替换一个字符 
// 
//
// 
//
// 示例 1： 
//
// 输入：word1 = "horse", word2 = "ros"
//输出：3
//解释：
//horse -> rorse (将 'h' 替换为 'r')
//rorse -> rose (删除 'r')
//rose -> ros (删除 'e')
// 
//
// 示例 2： 
//
// 输入：word1 = "intention", word2 = "execution"
//输出：5
//解释：
//intention -> inention (删除 't')
//inention -> enention (将 'i' 替换为 'e')
//enention -> exention (将 'n' 替换为 'x')
//exention -> exection (将 'n' 替换为 'c')
//exection -> execution (插入 'u')
// 
// Related Topics 字符串 动态规划


package leetcode.editor.cn;
//Java：编辑距离
public class P72EditDistance{
    public static void main(String[] args) {
        Solution solution = new P72EditDistance().new Solution();
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(solution.minDistance(word1,word2));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minDistance(String word1, String word2) {
        word1 = " "+word1;
        word2 = " "+word2;
        int row = word1.length();
        int col = word2.length();
        String[] split1 = word1.split("");
        String[] split2 = word2.split("");

        int[][] result = new int[row][col];
        for (int i = 0; i < col; i++) {
            result[0][i] = i;
        }
        print(result);
        for (int i = 0; i < row; i++) {
            result[i][0] = i;
        }
        print(result);
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                String u = split1[i];
                String d = split2[j];
                if (u.equals(d)){
                    result[i][j] = result[i-1][j-1];
                }else {
                    int zs = result[i-1][j-1];
                    int s = result[i-1][j];
                    int z = result[i][j-1];
                    int min = Math.min(Math.min(zs,z),s);
                    result[i][j] = min + 1;
                }
                print(result);
            }
        }
        return result[row-1][col-1];
    }

    private void print(int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < dp[0].length; j++) {
                sb.append(dp[i][j]).append(",");
            }
            System.out.println(sb.toString());
        }
        System.out.println("——————————————————————");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}