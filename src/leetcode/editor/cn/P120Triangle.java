//给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。 
//
// 例如，给定三角形： 
//
// [
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
// 
//
// 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。 
//
// 说明： 
//
// 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。 
// Related Topics 数组 动态规划


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：三角形最小路径和
public class P120Triangle{
    public static void main(String[] args) {
        Solution solution = new P120Triangle().new Solution();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));
        solution.minimumTotal(triangle);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0){
            return 0;
        }
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];

        for (int i = triangle.size() -1 ; i >= 0 ; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + row.get(j);
                print(dp);
            }
        }
        return dp[0][0];
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