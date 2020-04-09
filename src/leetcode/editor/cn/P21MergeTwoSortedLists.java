//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表

package leetcode.editor.cn;
//Java：Merge Two Sorted Lists
public class P21MergeTwoSortedLists{
    public static void main(String[] args) {
        Solution solution = new P21MergeTwoSortedLists().new Solution();

    }
    

//leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newPrev = new ListNode(0);
        ListNode curr = newPrev;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
        return newPrev.next;





//        ListNode result = new ListNode(0);
//        ListNode curr = result;
//        while (l1 != null && l2 != null){
//            if (l1.val >= l2.val){
//                curr.next = l2;
//                l2 = l2.next;
//            }else  if(l1.val < l2.val){
//                curr.next = l1;
//                l1 = l1.next;
//            }
//            curr = curr.next;
//        }
//        curr.next = l1 == null ? l2 : l1;
//        return result.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}