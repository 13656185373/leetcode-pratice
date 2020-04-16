//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，
//它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。 
//
// 
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
// Related Topics 链表 双指针


package leetcode.editor.cn;
//Java：链表中倒数第k个节点
public class P面试题22LianBiaoZhongDaoShuDiKgeJieDianLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题22LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
        ListNode root = new ListNode(1).setNext(new ListNode(2).setNext(new ListNode(3).setNext(new ListNode(4).setNext(new ListNode(5)))));
        root.print();
        solution.getKthFromEnd(root,2);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode curr1 = head;
        ListNode curr2 = head;
        for (int i = 0; i < k; i++) {
            if (curr1 == null){
                return null;
            }
            curr1 = curr1.next;
        }
        while (curr1 != null){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        curr2.print();
        return curr2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}