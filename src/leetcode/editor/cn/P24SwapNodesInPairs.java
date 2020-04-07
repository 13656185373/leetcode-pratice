//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表

package leetcode.editor.cn;
//Java：Swap Nodes in Pairs
public class P24SwapNodesInPairs{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        Solution solution = new P24SwapNodesInPairs().new Solution();
        head = solution.swapPairs(head);
        System.out.println(head);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
static class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this(val,null);
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = new ListNode(0);
        ListNode tmp = prev;
        while (tmp.next != null && tmp.next.next != null){
            ListNode start = tmp.next;
            ListNode end = tmp.next.next;

            tmp.next = end;
            start.next = end.next;
            end.next = start;

            tmp = start;
        }
        return prev.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}