//编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性： 
//
// 
// 每行中的整数从左到右按升序排列。 
// 每行的第一个整数大于前一行的最后一个整数。 
// 
//
// 示例 1: 
//
// 输入:
//matrix = [
//  [1,   3,  5,  7],
//  [10, 11, 16, 20],
//  [23, 30, 34, 50]
//]
//target = 3
//输出: true
// 
//
// 示例 2: 
//
// 输入:
//matrix = [
//  [1,   3,  5,  7],
//  [10, 11, 16, 20],
//  [23, 30, 34, 50]
//]
//target = 13
//输出: false 
// Related Topics 数组 二分查找


package leetcode.editor.cn;
//Java：搜索二维矩阵
public class P74SearchA2dMatrix{
    public static void main(String[] args) {
        Solution solution = new P74SearchA2dMatrix().new Solution();
        int[][] martix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(solution.searchMatrix(martix,16));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length<1){
            return false;
        }
        //每一行元素的数量
        int size = matrix[0].length-1;
        int targetRow = 0;
        while (targetRow < matrix.length-1){
            int tmp = matrix[targetRow][size];
            if (tmp < target){
                targetRow++;
            }else {
                break;
            }
        }
        int[] targetArr = matrix[targetRow];
        int begin = 0;
        int end = targetArr.length - 1;
        boolean result = false;
        while (begin <= end){
            int mid = (begin+end)/2;
            if (targetArr[mid] == target){
                result = true;
                break;
            }else if (targetArr[mid] < target){
                begin = mid +1;
            }else {
                end = mid - 1;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}