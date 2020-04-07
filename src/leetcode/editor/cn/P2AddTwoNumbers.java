////给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
////
//// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
////
//// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
////
//// 示例：
////
//// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
////输出：7 -> 0 -> 8
////原因：342 + 465 = 807
////
//// Related Topics 链表 数学
//
//package leetcode.editor.cn;
////Java：Add Two Numbers
//public class P2AddTwoNumbers{
//    public static void main(String[] args) {
//        Solution solution = new P2AddTwoNumbers().new Solution();
//        // TO TEST
//    }
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode result = new ListNode(0);
//        ListNode curr = result;
//        int carry = 0;
//        while (l1 != null || l2 !=null){
//            int x = l1 == null ? 0 : l1.val;
//            int y = l2 == null ? 0 : l2.val;
//            int sum = carry + x + y;
//            carry = sum /10 ;
//            curr.next = new ListNode(sum % 10);
//            curr = curr.next;
//            l1 = l1 == null? null:l1.next;
//            l2 = l2 == null? null:l2.next;
//        }
//        if (carry>0){
//            curr.next = new ListNode(carry);
//        }
//        return result.next;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
//
//}