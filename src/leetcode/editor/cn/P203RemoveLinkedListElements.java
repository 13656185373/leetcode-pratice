//删除链表中等于给定值 val 的所有节点。 
//
// 示例: 
//
// 输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
// 
// Related Topics 链表


package leetcode.editor.cn;
//Java：移除链表元素
public class P203RemoveLinkedListElements{
    public static void main(String[] args) {
        Solution solution = new P203RemoveLinkedListElements().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class ListNode {
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode curr = pre.next;
        while (curr!=null){

        }
        return  pre.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}