//给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。 
//
// 你应当保留两个分区中每个节点的初始相对位置。 
//
// 示例: 
//
// 输入: head = 1->4->3->2->5->2, x = 3
//输出: 1->2->2->4->3->5
// 
// Related Topics 链表 双指针


package leetcode.editor.cn;

import java.util.LinkedHashMap;

//Java：分隔链表
public class P86PartitionList{
    public static void main(String[] args) {
        Solution solution = new P86PartitionList().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode pre = before;
        ListNode after = new ListNode(0);
        ListNode curr = after;
        if (head==null || head.next ==null){
            return head;
        }
        while (head!=null){
            ListNode tmp = new ListNode(head.val);
            if (head.val<x){
                before.next = tmp;
                before = before.next;
            }else {
                curr.next = tmp;
                curr = curr.next;
            }
            head = head.next;
        }
        before.next = after.next;
        return pre.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}