package leetcode.editor.cn;

/**
 * @program: leetcode-pratice
 * @description:
 * @author: Marx.Chen
 * @create: 2020-04-15 17:33
 **/
public class ArrayUtil {
    public static void printDouble(int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]);
            }
        }
        System.out.println();
        System.out.println("——————————————");
    }

    public static void printSingle(int[] dp){
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i]+" ");
        }
        System.out.println();
        System.out.println("——————————————");
    }
}
