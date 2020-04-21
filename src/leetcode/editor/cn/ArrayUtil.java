package leetcode.editor.cn;

import java.util.List;

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

    public static void swap(int[] nums,int left,int right){
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }

    public static int[] convertInt(List<Integer> result){
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

    public static String[] convertStr(List<String> result){
        String[] arr = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
