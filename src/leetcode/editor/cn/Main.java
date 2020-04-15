package leetcode.editor.cn;


import java.util.Arrays;

public class Main {
    private static int k;
    private static int result = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,0,3,1,2};
        k = 2;
        Main main = new Main();
        main.topk(arr);
        System.out.println("第K大的数是"+result);
    }

    public void topk(int[] nums){
        if(nums == null || nums.length <1){
            return;
        }
        int n = nums.length;
        topk(nums,0,n-1);
    }

    public void topk(int[] nums,int left,int right){
        if(left >= right){
            return;
        }
        System.out.println(Arrays.toString(nums));
        int p = partition(nums,left,right);
        if(p<k){
            topk(nums,p+1,right);
        }if(p>k){
            topk(nums,left,p-1);
        }else{
            result = nums[p];
        }


    }

    public int partition(int[] nums,int left,int right){
        int q = nums[left];
        int begin = left;
        int end = right;
        while(begin!=end){
            while(begin < end && nums[end] > q){
                end--;
            }
            while(begin < end && nums[begin] <= q){
                begin++;
            }
            if(begin < end){
                int temp = nums[begin];
                nums[begin] = nums[end];
                nums[end] = temp;
            }
        }

        int temp = nums[left];
        nums[left] = nums[begin];
        nums[begin] = nums[left];
        return left;
    }

}