package leetcode.editor.cn;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this(val,null);
    }


    public ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    public void print(){
        StringBuilder sb = new StringBuilder("");
        ListNode curr = this;
        while (curr != null){
            sb.append(curr.val).append("->");
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }
}
