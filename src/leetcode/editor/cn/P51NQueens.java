//n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。 
//
// 
//
// 上图为 8 皇后问题的一种解法。 
//
// 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。 
//
// 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。 
//
// 示例: 
//
// 输入: 4
//输出: [
// [".Q..",  // 解法 1
//  "...Q",
//  "Q...",
//  "..Q."],
//
// ["..Q.",  // 解法 2
//  "Q...",
//  "...Q",
//  ".Q.."]
//]
//解释: 4 皇后问题存在两个不同的解法。
// 
// Related Topics 回溯算法


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：N皇后
public class P51NQueens{
    public static void main(String[] args) {
        Solution solution = new P51NQueens().new Solution();
        System.out.println(solution.solveNQueens(8));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<String>> result = new ArrayList<>();
    int[] rows;
    int[] mains;
    int[] secondary;
    int[] queens;

    int n;

    public List<List<String>> solveNQueens(int n) {
        rows = new int[n];
        mains = new int[2 * n - 1];
        secondary = new int[2 * n - 1];
        queens = new int[n];
        this.n = n;

        backtrack(0);
        return result;
    }


    /**
     *
     * @param row 当前行数
     */
    private void backtrack(int row) {
        if (row >= n){
            return;
        }
        for (int col = 0; col < n; col++) {
            if (safe(row,col)){
                placeQueen(row,col);
                if (row == n-1){
                    //已经是最后一行了，已经得出结果了，可以把之前放好的位置打印出来了
                    addSolution();
                }
                //放下一行
                backtrack(row+1);
                remove(row,col);
            }
        }
    }

        private void addSolution() {
            List<String> solution = new ArrayList<String>();
            for (int i = 0; i < n; ++i) {
                int col = queens[i];
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < col; ++j) sb.append(".");
                sb.append("Q");
                for(int j = 0; j < n - col - 1; ++j) sb.append(".");
                solution.add(sb.toString());
            }
            result.add(solution);
        }


        private boolean safe(int row, int col) {
            return rows[col] + mains[row - col + n - 1] + secondary[row + col] == 0;
        }

        private void placeQueen(int row, int col) {
        queens[row] = col;
        rows[col] = 1;
        mains[row-col+n-1] = 1;
        secondary[row+col] = 1;
        }

        private void remove(int row, int col) {
            queens[row] = 0;
            rows[col] = 0;
            mains[row - col + n - 1] = 0;
            secondary[row + col] = 0;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}