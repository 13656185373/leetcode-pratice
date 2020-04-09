//给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。 
//
// 示例 1: 
//
// 输入: 1->2->3->3->4->4->5
//输出: 1->2->5
// 
//
// 示例 2: 
//
// 输入: 1->1->1->2->3
//输出: 2->3 
// Related Topics 链表

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Java：Remove Duplicates from Sorted List II
public class P82RemoveDuplicatesFromSortedListIi{
    public static void main(String[] args) {
        Solution solution = new P82RemoveDuplicatesFromSortedListIi().new Solution();
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;
        while (curr != null){
            while (curr.next!=null  && curr.val == curr.next.val){
                curr = curr.next;
            }

            if (pre.next == curr){
                pre = pre.next;
            }else {
                pre.next = curr.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}