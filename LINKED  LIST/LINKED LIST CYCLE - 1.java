public class Solution {
    public boolean hasCycle(ListNode h) {
        ListNode slow = h;
        ListNode fast = h;
        if(h==null || h.next==null)
        {
            return false;
        }
        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
             return true;
        }
        return false;
    }
}
