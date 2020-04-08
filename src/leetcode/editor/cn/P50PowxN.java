//实现 pow(x, n) ，即计算 x 的 n 次幂函数。 
//
// 示例 1: 
//
// 输入: 2.00000, 10
//输出: 1024.00000
// 
//
// 示例 2: 
//
// 输入: 2.10000, 3
//输出: 9.26100
// 
//
// 示例 3: 
//
// 输入: 2.00000, -2
//输出: 0.25000
//解释: 2-2 = 1/22 = 1/4 = 0.25 
//
// 说明: 
//
// 
// -100.0 < x < 100.0 
// n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。 
// 
// Related Topics 数学 二分查找


package leetcode.editor.cn;

import java.util.HashMap;

//Java：Pow(x, n)
public class P50PowxN{
    public static void main(String[] args) {
        Solution solution = new P50PowxN().new Solution();
        System.out.println(solution.myPow(2.0,-2));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    HashMap<String,Double> cache = new HashMap();
    public double myPow(double x, int n) {
        return pow(x,n);
    }

    private double pow(double x, int i) {
        if (i == 1){
            return x;
        }else if (i == -1){
            return 1/x;
        }else if (i == 0){
            return 1;
        }

        if (cache.get(i+"")!=null){
            return cache.get(i+"");
        }

        double tmp = pow(x,i/2)*pow(x,i-i/2);
        cache.put(i+"",tmp);
        return tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}