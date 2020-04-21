//实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数
//问题。 
//
// 
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
// 
//
// 说明: 
//
// 
// -100.0 < x < 100.0 
// n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。 
// 
//
// 注意：本题与主站 50 题相同：https://leetcode-cn.com/problems/powx-n/ 
// Related Topics 递归


package leetcode.editor.cn;


import java.util.HashMap;

//Java：数值的整数次方
public class P面试题16ShuZhiDeZhengShuCiFangLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题16ShuZhiDeZhengShuCiFangLcof().new Solution();
        System.out.println(solution.myPow(2,-2));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    HashMap<String,Double> cache = new HashMap();
    public double myPow(double x, int n) {
        return  mypow(x,n/2) * mypow(x,n-n/2);
    }

    private double mypow(double x, int i) {
        if (i == 0){
            return 1;
        }else if (i == 1){
            return x;
        }else if (i == -1){
            return 1/x;
        }
        if (cache.get(i+"")!=null){
            return cache.get(i+"");
        }
        double tmp = mypow(x,i/2) * mypow(x,i-i/2);
        cache.put(i+"",tmp);
        return  tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}