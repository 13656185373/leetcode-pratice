package leetcode.editor.cn;

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int[] arr = new int[]{3,10,4,2,1,8,7,6,5};
        selectSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    private static void selectSort(int[] nums,int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i; j < n-1; j++) {
                if (nums[minIndex] > nums[j+1]){
                    minIndex = j+1;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }


        //插入排序
    private static void inserSort(int[] nums,int n){
        if (n <= 1){
            return;
        }
        for (int i = 0; i < n; i++) {
            int value = nums[i];
            int j = i-1;
            for (; j >= 0 ; --j) {
                if (nums[j] > value){
                    nums[j+1] = nums[j];
                }else {
                    break;
                }
            }
            nums[j+1] = value;
        }
    }

    //冒泡排序
    private static void bubbleSort(int[] nums,int n){
        if (n <= 1){
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j] > nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
}
