//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 链表


package leetcode.editor.cn;
//Java：反转链表
public class P面试题24FanZhuanLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题24FanZhuanLianBiaoLcof().new Solution();
        ListNode node = new ListNode(1).setNext(new ListNode(2).setNext(new ListNode(3).setNext(new ListNode(4).setNext(new ListNode(5)))));
        solution.reverseList(node);
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public ListNode reverseList(ListNode head) {
        head.print();
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}