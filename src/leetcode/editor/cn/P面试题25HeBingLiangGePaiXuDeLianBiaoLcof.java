//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 分治算法


package leetcode.editor.cn;
//Java：合并两个排序的链表
public class P面试题25HeBingLiangGePaiXuDeLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题25HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
        ListNode l1 = new ListNode(1).setNext(new ListNode(2).setNext(new ListNode(4)));
        l1.print();
        ListNode l2 = new ListNode(1).setNext(new ListNode(3).setNext(new ListNode(4)));
        l2.print();
        solution.mergeTwoLists(l1,l2);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null){
            return l1;
        }
        if (l1 == null){
            return l2;
        }
        ListNode result = new ListNode(0);
        ListNode head = result;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while (curr1 != null && curr2 != null){
            ListNode tmp = null;
            if (curr1.val <= curr2.val){
                tmp = new ListNode(curr1.val);
                curr1 = curr1.next;
            }else if (curr2.val < curr1.val){
                tmp = new ListNode(curr2.val);
                curr2 = curr2.next;
            }
            head.next = tmp;
            head = head.next;
        }

        if (curr1 != null){
            head.next = curr1;
        }else if (curr2 != null){
            head.next = curr2;
        }
        return result.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}