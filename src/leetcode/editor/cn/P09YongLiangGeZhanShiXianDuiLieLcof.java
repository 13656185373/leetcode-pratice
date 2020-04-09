//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的
//功能。(若队列中没有元素，deleteHead 操作返回 -1 ) 
//
// 
//
// 示例 1： 
//
// 输入：
//["CQueue","appendTail","deleteHead","deleteHead"]
//[[],[3],[],[]]
//输出：[null,null,3,-1]
// 
//
// 示例 2： 
//
// 输入：
//["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
//[[],[],[5],[2],[],[]]
//输出：[null,-1,null,null,5,2]
// 
//
// 提示： 
//
// 
// 1 <= values <= 10000 
// 最多会对 appendTail、deleteHead 进行 10000 次调用 
// 
// Related Topics 栈 设计


package leetcode.editor.cn;

import java.util.ArrayDeque;

//Java：用两个栈实现队列
public class P09YongLiangGeZhanShiXianDuiLieLcof {
    public static void main(String[] args) {

        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {
    private ArrayDeque<Integer>[] stacks = new ArrayDeque[2];

    public CQueue() {
        stacks[0] = new ArrayDeque<>();
        stacks[1] = new ArrayDeque<>();
    }
    
    public void appendTail(int value) {
        stacks[0].push(value);
    }
    
    public int deleteHead() {
        int head = 0;
        if (stacks[0].size()<1){
            head =  -1;
        }else {
            while (stacks[0].size() > 0){
                stacks[1].push(stacks[0].pop());
            }
            head = stacks[1].pollFirst();
            while (stacks[1].size() > 0){
                stacks[0].push(stacks[1].pop());
            }
        }
        return head;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)

}