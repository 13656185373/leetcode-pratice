//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表

package leetcode.editor.cn;
//Java：Remove Duplicates from Sorted List
public class P83RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {
        Solution solution = new P83RemoveDuplicatesFromSortedList().new Solution();
        // TO TEST
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null){
            if (curr.next.val==curr.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}