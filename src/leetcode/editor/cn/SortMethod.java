package leetcode.editor.cn;

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        SortMethod method = new SortMethod();
        int[] arr = new int[]{3,10,4,2,1,8,7,6,5};
        method.quickSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //快速排序》》》》》》》》》》》》》》》》》》》》》》》
    private void quickSort(int[] nums,int n) {
        if (n <= 1) {
            return;
        }
        quick_sort(nums,0,n-1);
    }

    private void quick_sort(int[] nums, int left, int right) {
        if (left>=right){
            return;
        }
        int pivot = partition(nums,left,right);
        quick_sort(nums,left,pivot-1);
        quick_sort(nums,pivot+1,right);
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left != right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            //找到left比基准大，right比基准小，进行交换
            if (left < right) {
                swap(arr, left, right);
            }
        }
        //第一轮完成，让left和right重合的位置和基准交换，返回基准的位置
        swap(arr, startIndex, left);
        return left;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
    //快速排序《《《《《《《《《《《《《《《《《《《《《《《


    //归并排序》》》》》》》》》》》》》》》》》》》》》》》
    private void mergeSort(int[] nums,int n) {
        if (n <= 1) {
            return;
        }
        merge_sort(nums,0,n-1);
    }

    private void merge_sort(int[] nums, int left, int right) {
        if (left >= right){
            return;
        }
        int mid = (left+right)/2;
        merge_sort(nums,left,mid);
        merge_sort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[nums.length];
        int p1 = left;
        int p2 = mid + 1;
        int k = left;
        while (p1 <= mid && p2<=right){
            if (nums[p1] <= nums[p2]){
                tmp[k++] = nums[p1++];
            }else {
                tmp[k++] = nums[p2++];
            }
        }

        while (p1<=mid){
            tmp[k++] = nums[p1++];
        }
        while (p2<=right){
            tmp[k++] = nums[p2++];
        }

        for (int i = left; i <= right ; i++) {
            nums[i]=tmp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    //归并排序《《《《《《《《《《《《《《《《《《《《《《《

    //选择排序》》》》》》》》》》》》》》》》》》》》》》》
    private void selectSort(int[] nums,int n) {
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
    //选择排序《《《《《《《《《《《《《《《《《《《《《《《


    //插入排序》》》》》》》》》》》》》》》》》》》》》》》
    private void inserSort(int[] nums,int n){
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
    //插入排序《《《《《《《《《《《《《《《《《《《《《《《

    //冒泡排序》》》》》》》》》》》》》》》》》》》》》》》
    private void bubbleSort(int[] nums,int n){
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
    //冒泡排序《《《《《《《《《《《《《《《《《《《《《《《
}
